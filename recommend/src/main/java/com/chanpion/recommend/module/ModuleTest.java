//package com.chanpion.recommend.module;
//
//import com.alipay.jarslink.api.Module;
//import com.alipay.jarslink.api.ModuleConfig;
//import com.alipay.jarslink.api.ModuleManager;
//import org.springframework.util.Assert;
//
//import javax.annotation.Resource;
////import org.springframework.util.Assert;
//
///**
// * @author April Chen
// * @date 2019/5/5 10:39
// */
//public class ModuleTest {
//
//    @Resource
//    private ModuleManager moduleManager;
//
//    public void invoke(String name) {
//        //查找模块
//        Module findModule = moduleManager.find(name);
//        Assert.notNull(findModule, "null");
//
//        //查找和执行Action
//        String actionName = "helloworld";
//        ModuleConfig moduleConfig = new ModuleConfig();
//        moduleConfig.setName("h");
//        moduleConfig.setEnabled(true);
//        ModuleConfig result = findModule.doAction(actionName, moduleConfig);
//    }
//}
