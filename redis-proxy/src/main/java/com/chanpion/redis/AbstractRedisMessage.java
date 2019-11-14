package com.chanpion.redis;

import com.chanpion.redis.codec.RedisMessageType;

/**
 * @author April Chen
 * @date 2019/10/11 17:11
 */
public abstract class AbstractRedisMessage implements RedisMessage {

    protected byte[] content;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public RedisMessageType getType() {
        return null;
    }
}
