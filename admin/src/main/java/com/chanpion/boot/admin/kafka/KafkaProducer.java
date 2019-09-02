package com.chanpion.boot.admin.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2019/3/27 13:57
 */
//@Service
public class KafkaProducer {

    private static final String TOPIC = "test";
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
