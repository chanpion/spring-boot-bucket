package com.chanpion.boot.admin.auth;

import com.chanpion.boot.admin.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author April Chen
 * @date 2019/1/15 11:28
 */
@Repository
public class UserDao {

    public User findByName(String username) {
        User user = new User();
        user.setName(username);
        return user;
    }
}
