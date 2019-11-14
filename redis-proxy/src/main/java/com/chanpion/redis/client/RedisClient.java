package com.chanpion.redis.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;


/**
 * @author April Chen
 * @date 2019/10/12 16:29
 */
public class RedisClient {
    private static EventLoopGroup group = new NioEventLoopGroup();

    public static void main(String[] args) {
        Bootstrap redisBootstrap = new Bootstrap();
        redisBootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.ALLOCATOR, ByteBufAllocator.DEFAULT)
                .option(ChannelOption.WRITE_BUFFER_WATER_MARK, new WriteBufferWaterMark(8 * 1024, 32 * 1024))
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 1000)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel channel) throws Exception {
                        channel.pipeline().addLast(new LoggingHandler())
                                .addLast(new SimpleEncoder());
                    }
                });
        ChannelFuture channelFuture = redisBootstrap.connect("localhost", 6379);
        channelFuture.awaitUninterruptibly(1000);
        System.out.println(channelFuture.isSuccess());
        Channel channel = channelFuture.channel();
        ChannelFuture future = channel.writeAndFlush("*3\\r\\n$5\\r\\nsetnx\\r\\n$1\\r\\na\\r\\n$1\\r\\nb\\r\\n");
        future.addListener(future1 -> System.out.println("write finished"));
    }
}
