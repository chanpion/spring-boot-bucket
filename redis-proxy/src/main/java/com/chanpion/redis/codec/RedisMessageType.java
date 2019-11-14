package com.chanpion.redis.codec;

import io.netty.buffer.ByteBuf;

/**
 * Redis协议数据类型
 *
 * @author April Chen
 * @date 2019/10/11 16:00
 */
public enum RedisMessageType {
    /**
     * 内联
     */
    INLINE_COMMAND(null, true),
    /**
     * 简单字符串，状态回复，如+OK
     */
    SIMPLE_STRING((byte) '+', true),
    /**
     * 错误回复
     */
    ERROR((byte) '-', true),
    /**
     * 整数回复
     */
    INTEGER((byte) ':', true),
    /**
     * 批量回复
     */
    BULK_STRING((byte) '$', false),
    /**
     * 多条批量回复
     */
    ARRAY((byte) '*', false);

    private final Byte value;
    private final boolean inline;

    RedisMessageType(Byte value, boolean inline) {
        this.value = value;
        this.inline = inline;
    }

    /**
     * Write the message type's prefix to the given buffer.
     */
    public void writeTo(ByteBuf out) {
        if (value == null) {
            return;
        }
        out.writeByte(value);
    }

    public static RedisMessageType valueOf(byte value) {
        switch (value) {
            case '+':
                return SIMPLE_STRING;
            case '-':
                return ERROR;
            case ':':
                return INTEGER;
            case '$':
                return BULK_STRING;
            case '*':
                return ARRAY;
            default:
                return INLINE_COMMAND;
        }
    }


    public Byte getValue() {
        return value;
    }

    public boolean isInline() {
        return inline;
    }
}
