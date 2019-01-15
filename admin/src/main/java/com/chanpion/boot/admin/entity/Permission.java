package com.chanpion.boot.admin.entity;

import java.io.Serializable;

/**
 * 权限
 *
 * @author April Chen
 * @date 2019/1/15 13:55
 */
public class Permission extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 4761232317141357606L;

    private long id;
    private long roleId;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
