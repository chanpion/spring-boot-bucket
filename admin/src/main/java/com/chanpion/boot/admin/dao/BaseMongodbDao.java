package com.chanpion.boot.admin.dao;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author April Chen
 * @date 2019/1/16 15:07
 */
public class BaseMongodbDao<T> {

    private MongoTemplate mongoTemplate;

    public BaseMongodbDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<T> findAll() {
        Query query = new Query();
        return mongoTemplate.findAll(getEntityClass(), "");
    }

    private Class<T> getEntityClass() {
        return ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }
}
