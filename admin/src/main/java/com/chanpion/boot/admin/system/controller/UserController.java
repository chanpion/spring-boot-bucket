package com.chanpion.boot.admin.system.controller;

import com.chanpion.boot.admin.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author April Chen
 * @date 2019/1/17 15:46
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping("/list")
    public List<User> list() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    public User getUser(@PathVariable Long id) {
        return new User();
    }
}
