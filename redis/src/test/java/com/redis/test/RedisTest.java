package com.redis.test;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author April Chen
 * @date 2019/5/14 16:29
 */

public class RedisTest {

    @Test
    public void proxyTest() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxWaitMillis(3000);
        config.setMaxTotal(200);
        JedisPool jedisPool = new JedisPool(config, "172.19.80.186", 9216, 200, "RDC&iwencai#solr");
        Jedis jedis = jedisPool.getResource();
        String res = jedis.set("RDC&set", "set");
        System.out.println(res);
        System.out.println(jedis.get("RDC&set"));
        Map<String, String> map = new HashMap<>(8);
        map.put("code", "1.1");
        map.put("name", "test");

        res = jedis.hmset("RDC:test1", map);
        System.out.println(res);

//        System.out.println(jedis.hget("RDC:testmap", "code"));
        List<String> r = jedis.hmget("RDC:test1", "code", "name");
        System.out.println(r);
    }

    @Test
    public void testLec() {
        RedisURI redisURI = RedisURI.Builder.redis("172.19.80.186")
                .withPassword("RDC&iwencai#solr")
                .withPort(9216)
                .build();
        RedisClient redisClient = RedisClient.create(redisURI);
        StatefulRedisConnection connection = redisClient.connect();
        RedisCommands<String, String> commands = connection.sync();
        Map<String, String> map = new HashMap<>();
        map.put("p", "1.1");
        map.put("name", "name1");
        System.out.println(commands.hmset("RDC:test11", map));
        System.out.println(commands.hmget("RDC:test11", "p", "name"));
    }
}

