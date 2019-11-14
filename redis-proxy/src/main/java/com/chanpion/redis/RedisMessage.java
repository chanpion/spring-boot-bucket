package com.chanpion.redis;

import com.chanpion.redis.codec.RedisMessageType;

/**
 * @author April Chen
 * @date 2019/1/23 19:19
 */
public interface RedisMessage {

    RedisMessageType getType();
}
