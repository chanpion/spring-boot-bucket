package com.chanpion.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author April Chen
 * @date 2019/6/26 9:56
 */
public class LogDemo {
    private static Logger logger = LoggerFactory.getLogger(LogDemo.class);
    public static void main(String[] args) {
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.debug("debug");
        logger.trace("trace");
    }
}
