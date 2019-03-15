package com.chanpion.boot.admin.metrics;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.apache.commons.lang3.StringUtils;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.OperatingSystemMXBean;
import java.util.Collections;
import java.util.List;

/**
 * @author April Chen
 * @date 2019/3/14 13:17
 */
public class SystemMetrics implements MeterBinder {
    private final OperatingSystemMXBean operatingSystemMXBean;
    private final Iterable<Tag> tags;

    public SystemMetrics() {
        this.tags = Collections.emptyList();
        this.operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();

    }

    @Override
    public void bindTo(MeterRegistry registry) {
        Gauge.builder("system.load.average", operatingSystemMXBean, OperatingSystemMXBean::getSystemLoadAverage)
                .tags(tags)
                .description("The average load of the machine")
                .register(registry);
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();
        for (MemoryPoolMXBean memoryPoolMXBean : memoryPoolMXBeans) {
            MemoryUsage memoryUsage = memoryPoolMXBean.getUsage();
            String name = "memory.pool." + beautifyName(memoryPoolMXBean.getName()) + ".used";
            Gauge.builder(name, memoryUsage, MemoryUsage::getUsed)
                    .tags(tags)
                    .description("memory pool used")
                    .baseUnit("bytes")
                    .register(registry);
        }
    }

    private String beautifyName(String name) {
        return StringUtils.replace(name, " ", "_").toLowerCase();
    }
}
