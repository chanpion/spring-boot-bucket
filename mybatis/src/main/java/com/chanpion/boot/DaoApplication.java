package com.chanpion.boot;

import com.chanpion.boot.dao.UserDao;
import com.chanpion.boot.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2019/2/27 17:29
 */
@SpringBootApplication
public class DaoApplication implements CommandLineRunner {
    @Resource
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = userDao.findByName("admin");
        System.out.println(user);
    }
}
