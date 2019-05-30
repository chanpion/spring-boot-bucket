package com.chanpion.boot.admin;

import com.chanpion.boot.admin.dao.UserDao;
import com.chanpion.boot.admin.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2019/1/12 10:30
 */
@SpringBootApplication
public class AdminApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private UserDao userDao;

    @Override
    public void run(String... args) throws Exception {

        List<User> users = mongoTemplate.findAll(User.class);
        System.out.println(users);
    }
}
