package com.chanpion.boot.redis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author April Chen
 * @date 2019/5/13 15:38
 */
@SpringBootApplication
public class RedisApplication implements CommandLineRunner {

    @Resource
    private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 10; i++) {
            new Thread(new Demo(i)).start();
        }

        System.out.println(redisTemplate.opsForHash().get("RDC:test", "code"));
        System.out.println("finished");
    }

    public class Demo implements Runnable {

        private int i;

        public Demo(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            Map<String, Object> map = new HashMap<>(8);
            map.put("code", 1.1);
            map.put("name", "test");
            for (int j = 0; j < 1000; j++) {
//                redisTemplate.opsForHash().putAll("RDC:test" + i + j, map);
//                System.out.println("key:" + "RDC:test" + i + j);
                System.out.println(redisTemplate.opsForHash().get("RDC: test" + i + j,"code"));
            }
        }
    }
}
