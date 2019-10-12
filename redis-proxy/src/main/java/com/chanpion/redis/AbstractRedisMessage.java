package com.chanpion.redis;

/**
 * @author April Chen
 * @date 2019/10/11 17:11
 */
public class AbstractRedisMessage implements RedisMessage {

    protected byte[] content;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
