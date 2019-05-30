//package com.chanpion.recommend.config;
//
//import com.alipay.jarslink.api.ModuleLoader;
//import com.alipay.jarslink.api.ModuleManager;
//import com.alipay.jarslink.api.impl.ModuleLoaderImpl;
//import com.alipay.jarslink.api.impl.ModuleManagerImpl;
//import com.chanpion.recommend.module.ModuleRefreshSchedulerImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author April Chen
// * @date 2019/4/30 17:04
// */
//@Configuration
//public class JarsLinkConfig {
//
//    @Bean
//    public ModuleLoader moduleLoader() {
//        return new ModuleLoaderImpl();
//    }
//
//    @Bean
//    public ModuleManager moduleManager() {
//        return new ModuleManagerImpl();
//    }
//
////    @Bean
//    public ModuleRefreshSchedulerImpl moduleRefreshScheduler(ModuleLoader moduleLoader, ModuleManager moduleManager) {
//        ModuleRefreshSchedulerImpl moduleRefreshScheduler = new ModuleRefreshSchedulerImpl();
//        moduleRefreshScheduler.setModuleLoader(moduleLoader);
//        moduleRefreshScheduler.setModuleManager(moduleManager);
//        return moduleRefreshScheduler;
//    }
//}
