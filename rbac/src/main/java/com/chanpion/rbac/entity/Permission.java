package com.chanpion.rbac.entity;

import lombok.Data;

import java.util.Date;

/**
 * 权限
 *
 * @author April Chen
 * @date 2020/2/24 16:18
 */
@Data
public class Permission {
    private Long id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
