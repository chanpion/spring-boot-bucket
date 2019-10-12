package com.chanpion.redis.client;

import com.chanpion.redis.RedisConsts;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;

/**
 * @author April Chen
 * @date 2019/10/12 17:12
 */
public class SimpleEncoder extends MessageToByteEncoder<String> {


    @Override
    protected void encode(ChannelHandlerContext ctx, String msg, ByteBuf out) throws Exception {
        out.writeCharSequence(msg, Charset.forName(RedisConsts.DEFAULT_CHARSET));
    }
}
