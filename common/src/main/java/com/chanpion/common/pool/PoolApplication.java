package com.chanpion.common.pool;

/**
 * @author April Chen
 * @date 2019/9/18 13:44
 */
public class PoolApplication {
    public static void main(String[] args) throws Exception {
        PooledResourceFactory factory = new PooledResourceFactory();
        PoolConfig poolConfig = new PoolConfig();
        poolConfig.setMaxTotal(10);
        poolConfig.setMaxWaitMillis(1000);
        ResourcePool resourcePool = new ResourcePool(factory, poolConfig);

        PooledResource resource = resourcePool.borrowObject();
        resource.doSomething();
        resourcePool.returnObject(resource);
    }
}
