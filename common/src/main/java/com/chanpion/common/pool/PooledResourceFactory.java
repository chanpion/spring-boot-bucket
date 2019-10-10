package com.chanpion.common.pool;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author April Chen
 * @date 2019/9/18 11:18
 */
public class PooledResourceFactory extends BasePooledObjectFactory<PooledResource> {
    private AtomicInteger idCount = new AtomicInteger(1);
    @Override
    public PooledResource create() throws Exception {
        return new PooledResource(idCount.getAndIncrement());
    }

    @Override
    public PooledObject<PooledResource> wrap(PooledResource pooledResource) {
        return new DefaultPooledObject<>(pooledResource);
    }

    @Override
    public boolean validateObject(PooledObject<PooledResource> p) {
        return p.getObject().isAvailable();
    }

    @Override
    public void destroyObject(PooledObject<PooledResource> p) throws Exception {
        super.destroyObject(p);
    }
}
