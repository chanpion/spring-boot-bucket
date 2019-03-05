package com.chanpion.boot.admin.auth;

import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author April Chen
 * @date 2019/1/16 15:07
 */
public abstract class AbstractMongodbDao<T, Q> {

    private MongoTemplate mongoTemplate;

    public AbstractMongodbDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
