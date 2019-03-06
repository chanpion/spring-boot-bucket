package com.chanpion.boot.admin.auth;

import com.chanpion.boot.admin.constant.Consts;
import com.chanpion.boot.admin.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpServletRequest;

/**
 * @author April Chen
 * @date 2019/1/15 11:19
 */
public class SecurityUtil {
    public static Session getSession() {
        Subject currentUser = SecurityUtils.getSubject();
        return currentUser.getSession();
    }

    public static User getCurrentUser() {
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession(false);
        return session == null ? null : (User) session.getAttribute(Consts.LOGIN_USER_KEY);
    }

    public static long getCurrentUserId() {
        long userId = 1000;
        User user = getCurrentUser();
        if (user != null) {
            userId = user.getId();
        }
        return userId;
    }

    public static User getCurrentUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(Consts.LOGIN_USER_KEY);
    }

    public static long getCurrentUserId(HttpServletRequest request) {
        long userId = 0;
        User user = getCurrentUser(request);
        if (user != null) {
            userId = user.getId();
        }
        return userId;
    }

    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
