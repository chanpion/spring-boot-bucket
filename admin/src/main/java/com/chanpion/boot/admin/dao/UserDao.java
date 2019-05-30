package com.chanpion.boot.admin.dao;

import com.chanpion.boot.admin.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author April Chen
 * @date 2019/3/12 19:15
 */
public interface UserDao extends MongoRepository<User, String> {

    /**
     * findByName
     *
     * @param username
     * @return User
     */
    User findByName(String username);
}
