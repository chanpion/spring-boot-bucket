package com.chanpion.common.pool;

/**
 * @author April Chen
 * @date 2019/9/18 11:18
 */
public class PooledResource {
    private int id;


    public PooledResource(int id) {
        this.id = id;
    }

    public void doSomething() {

    }

    public boolean isAvailable() {
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
