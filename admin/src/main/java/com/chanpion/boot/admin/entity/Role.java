package com.chanpion.boot.admin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 *
 * @author April Chen
 * @date 2019/1/15 13:45
 */
public class Role extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -628603820479707825L;

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
