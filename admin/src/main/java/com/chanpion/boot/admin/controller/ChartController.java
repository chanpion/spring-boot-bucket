package com.chanpion.boot.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author April Chen
 * @date 2019/1/14 16:48
 */
@Controller
public class ChartController {

    @RequestMapping("/chart/morris")
    public String morris() {
        return "pages/charts/morris";
    }

    @RequestMapping("/chart/inline")
    public String inline() {
        return "pages/charts/inline";
    }

    @RequestMapping("/chart/flot")
    public String flot() {
        return "pages/charts/flot";
    }

    @RequestMapping("/table")
    public String table() {
        return "pages/table";
    }
}
