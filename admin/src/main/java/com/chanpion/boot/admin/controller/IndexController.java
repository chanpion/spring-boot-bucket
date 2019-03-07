package com.chanpion.boot.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author April Chen
 * @date 2019/1/12 16:39
 */
@ApiIgnore
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    private String login() {
        return "login";
    }
}
