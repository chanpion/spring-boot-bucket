package com.hexin.boot.aop;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.hello();
    }
}
