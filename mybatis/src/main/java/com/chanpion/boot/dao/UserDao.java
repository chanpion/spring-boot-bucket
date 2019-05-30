package com.chanpion.boot.dao;

import com.chanpion.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author April Chen
 * @date 2019/2/28 20:35
 */
@Mapper
public interface UserDao {

    /**
     * find user
     *
     * @param username
     * @return
     */
    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByName(@Param("username") String username);
}
