package com.chanpion.redis.codec;

import com.chanpion.redis.*;
import com.sun.org.apache.bcel.internal.classfile.CodeException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.CodecException;
import io.netty.handler.codec.ReplayingDecoder;
import io.netty.util.ByteProcessor;

import java.util.List;

/**
 * @author April Chen
 * @date 2019/1/23 19:25
 */
public class RedisMessageDecoder extends ReplayingDecoder<RedisMessageDecoder.State> {

    private RedisMessageType type;

    private RedisMessage redisMessage;

    public RedisMessageDecoder() {
        super(State.DECODE_TYPE);
    }

    enum State {
        /**
         * 解码回复类型
         */
        DECODE_TYPE,
        DECODE_INLINE,
        DECODE_LENGTH,
        DECODE_BULK_STRING_EOF,
        DECODE_BULK_STRING_CONTENT
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        switch (state()) {
            case DECODE_TYPE:
                decodeType(in);
                break;
            case DECODE_INLINE:
                decodeInline(in);
                break;
            case DECODE_LENGTH:
                break;
            case DECODE_BULK_STRING_EOF:
                break;
            case DECODE_BULK_STRING_CONTENT:
                break;
            default:
                throw new CodecException("Unknown state: " + state());
        }
    }

    private boolean decodeType(ByteBuf in) throws Exception {
        byte typeByte = in.readByte();
        type = RedisMessageType.valueOf(typeByte);
        redisMessage = newRedisMessage(type);
        if (type.isInline()) {
            checkpoint(State.DECODE_INLINE);
        } else {
            checkpoint(State.DECODE_LENGTH);
        }

        return true;
    }

    private void decodeInline(ByteBuf in) {
        ByteBuf lineBytes = readLine(in);

    }

    private boolean decodeLength(ByteBuf in) {
        int length = in.readInt();
        ByteBuf lineBuf = readLine(in);
        if (lineBuf == null) {
            return false;
        }
        lineBuf.readInt();

        return true;
    }

    private RedisMessage newRedisMessage(RedisMessageType type) {
        switch (type) {
            case SIMPLE_STRING:
                return new StringRedisMessage();
            case ERROR:
                return new ErrorRedisMessage();
            case BULK_STRING:
                return new BulkRedisMessage();
            case INTEGER:
                return new IntegerRedisMessage();
            case ARRAY:
                return new ArrayRedisMessage();
            default:
                throw new CodecException("bad type");

        }
    }

    /**
     * 读内容
     *
     * @param in
     * @return
     */
    private ByteBuf readLine(ByteBuf in) {
        int lfIndex = in.forEachByte(ByteProcessor.FIND_LF);
        ByteBuf data = in.readSlice(lfIndex - in.readerIndex() - 1);
        readEndOfLine(in);
        return data;
    }

    /**
     * 读\r\n
     *
     * @param in
     */
    private void readEndOfLine(final ByteBuf in) {
        byte cr = in.readByte();
        byte lf = in.readByte();
        if (cr == RedisConsts.CR_BYTE && lf == RedisConsts.LF_BYTE) {
            return;
        }
        throw new CodecException("delimiter: [" + cr + "," + lf + "](expected: \\r\\n)");
    }
}
