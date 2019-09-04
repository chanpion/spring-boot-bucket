package com.chanpion.boot.mybatis.test;

import com.chanpion.boot.mybatis.entity.User;
import com.chanpion.boot.mybatis.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author April Chen
 * @date 2019/9/2 17:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
