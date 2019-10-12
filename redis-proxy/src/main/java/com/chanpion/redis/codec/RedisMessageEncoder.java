package com.chanpion.redis.codec;

import com.chanpion.redis.RedisMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * Encodes RedisMessage into bytes following
 *
 * @author April Chen
 * @date 2019/1/23 19:21
 */
public class RedisMessageEncoder extends MessageToMessageEncoder<RedisMessage> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RedisMessage redisMessage, List<Object> list) throws Exception {

    }
}
