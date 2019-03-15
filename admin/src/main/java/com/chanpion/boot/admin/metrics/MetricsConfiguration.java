package com.chanpion.boot.admin.metrics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author April Chen
 * @date 2019/3/14 13:36
 */
@Configuration
public class MetricsConfiguration {

    @Bean
    public SystemMetrics systemMetrics() {
        return new SystemMetrics();
    }
}
