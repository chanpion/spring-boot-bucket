package com.chanpion.boot.mybatis;

import com.chanpion.boot.mybatis.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2019/9/2 17:01
 */
@SpringBootApplication
@MapperScan("com.chanpion.boot.mybatis.mapper")
public class MybatisApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Resource
    private UserMapper userMapper;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(userMapper.selectById(100L));
//        userMapper.selectList(null).forEach(System.out::println);
    }
}
