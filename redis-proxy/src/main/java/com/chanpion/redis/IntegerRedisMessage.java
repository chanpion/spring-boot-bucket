package com.chanpion.redis;

import com.chanpion.redis.codec.RedisMessageType;

/**
 * @author April Chen
 * @date 2019/10/11 17:16
 */
public class IntegerRedisMessage extends AbstractRedisMessage {

    private int value;

    public IntegerRedisMessage() {
    }

    public IntegerRedisMessage(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public RedisMessageType getType() {
        return RedisMessageType.INTEGER;
    }
}
