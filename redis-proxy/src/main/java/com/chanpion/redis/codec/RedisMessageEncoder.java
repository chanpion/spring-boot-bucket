package com.chanpion.redis.codec;

import com.chanpion.redis.ArrayRedisMessage;
import com.chanpion.redis.RedisMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * Encodes RedisMessage into bytes following
 *
 * @author April Chen
 * @date 2019/1/23 19:21
 */
public class RedisMessageEncoder extends MessageToByteEncoder<RedisMessage> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RedisMessage redisMessage, ByteBuf buf) throws Exception {
        writeType(redisMessage, buf);
        doEncode(redisMessage, buf);
        writeEOF(buf);
    }

    private void doEncode(RedisMessage redisMessage, ByteBuf buf) {
//        ByteBufUtil.writeUtf8(buf, content);
    }

    private void writeType(RedisMessage redisMessage, ByteBuf buf) {
        redisMessage.getType().writeTo(buf);
    }

    private void writeEOF(ByteBuf buf) {
        buf.writeByte('\r');
        buf.writeByte('\n');
    }

    private void encodeArrayRedisMessage(ArrayRedisMessage message, ByteBuf buf) {
        writeType(message, buf);
        buf.writeInt(message.getCount());
        writeEOF(buf);
    }
}
