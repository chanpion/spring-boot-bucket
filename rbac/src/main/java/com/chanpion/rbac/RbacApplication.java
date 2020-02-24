package com.chanpion.rbac;

import com.chanpion.rbac.dao.UserDAO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/24 15:18
 */
@MapperScan("com.chanpion.rbac.dao")
@SpringBootApplication
public class RbacApplication implements CommandLineRunner {

    @Resource
    private UserDAO userDAO;

    public static void main(String[] args) {
        SpringApplication.run(RbacApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userDAO.selectById(1L));
    }
}
