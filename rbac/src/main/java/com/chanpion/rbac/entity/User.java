package com.chanpion.rbac.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户
 *
 * @author April Chen
 * @date 2020/2/24 16:17
 */
@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String mobile;
    private Date createTime;
    private Date updateTime;
}
