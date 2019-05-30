package com.chanpion.boot.admin.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 *
 * @author April Chen
 * @date 2019/1/15 11:08
 */
@Document(collection = "user")
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 9175311019615554374L;

    private long id;
    private String name;
    private String nick;
    private String password;
    private String salt;
    /**
     * 用户所有角色值，用于shiro做角色权限的判断
     */
    private Set<String> roles = new HashSet<>();
    /**
     * 用户所有权限值，用于shiro做资源权限的判断
     */
    private Set<String> perms = new HashSet<>();

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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getPerms() {
        return perms;
    }

    public void setPerms(Set<String> perms) {
        this.perms = perms;
    }
}
