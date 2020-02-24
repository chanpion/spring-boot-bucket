package com.chanpion.rbac.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chanpion.rbac.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2020/2/24 16:41
 */
@Repository
public interface UserDAO extends BaseMapper<User> {
}
