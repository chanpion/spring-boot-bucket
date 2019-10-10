package com.chanpion.common.pool;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * @author April Chen
 * @date 2019/9/18 11:30
 */
public class ResourcePool extends GenericObjectPool<PooledResource>{
    public ResourcePool(PooledObjectFactory<PooledResource> factory) {
        super(factory);
    }

    public ResourcePool(PooledObjectFactory<PooledResource> factory, GenericObjectPoolConfig<PooledResource> config) {
        super(factory, config);
    }

    public ResourcePool(PooledObjectFactory<PooledResource> factory, GenericObjectPoolConfig<PooledResource> config, AbandonedConfig abandonedConfig) {
        super(factory, config, abandonedConfig);
    }
}
