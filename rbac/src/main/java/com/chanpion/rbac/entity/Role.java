package com.chanpion.rbac.entity;

import lombok.Data;

import java.util.Date;

/**
 * 角色
 * @author April Chen
 * @date 2020/2/24 16:17
 */
@Data
public class Role {
    private Long id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
