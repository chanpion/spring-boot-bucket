package com.chanpion.samples;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * @author April Chen
 * @date 2019/11/19 20:32
 */
public class PoolDemo {

    public static class Foo {
    }

    private static class PooledFooFactory extends BasePooledObjectFactory<Foo> {
        private static final long VALIDATION_WAIT_IN_MILLIS = 1000;

        @Override
        public Foo create() throws Exception {
            return new Foo();
        }

        @Override
        public PooledObject<Foo> wrap(Foo obj) {
            return new DefaultPooledObject<>(obj);
        }
    }

    public static void main(String[] args) {
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
    }
}
