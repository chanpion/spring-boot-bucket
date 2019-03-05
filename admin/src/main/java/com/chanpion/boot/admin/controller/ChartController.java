package com.chanpion.boot.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author April Chen
 * @date 2019/1/14 16:48
 */
@Api("chart api")
@ApiIgnore
@Controller
public class ChartController {

    @RequestMapping("/chart/morris")
    public String morris() {
        return "pages/charts/morris";
    }
    @RequestMapping("/chart/chartjs")
    public String chartjs() {
        return "pages/charts/chartjs";
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
