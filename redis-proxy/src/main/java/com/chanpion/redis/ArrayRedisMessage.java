package com.chanpion.redis;

import com.chanpion.redis.codec.RedisMessageType;

import java.util.List;

/**
 * @author April Chen
 * @date 2019/10/11 17:17
 */
public class ArrayRedisMessage extends AbstractRedisMessage {
    private int count;
    private List<RedisMessage> children;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<RedisMessage> getChildren() {
        return children;
    }

    public void setChildren(List<RedisMessage> children) {
        this.children = children;
    }

    @Override
    public RedisMessageType getType() {
        return RedisMessageType.ARRAY;
    }
}
