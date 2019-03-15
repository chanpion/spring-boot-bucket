package com.chanpion.boot.admin.dao;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author April Chen
 * @date 2019/1/16 15:07
 */
public class BaseMongodbDao<T> {

    @Resource
    private MongoTemplate mongoTemplate;

    private String collectionName;


    public BaseMongodbDao(MongoTemplate mongoTemplate, String collectionName) {
        this.mongoTemplate = mongoTemplate;
        this.collectionName = collectionName;
    }

    public List<T> findAll() {
        return mongoTemplate.findAll(getEntityClass(), collectionName);
    }

    public T findById(Object id) {
        return mongoTemplate.findById(id, getEntityClass(), collectionName);
    }

    public T findOne() {
        Query query = new Query();
        return mongoTemplate.findOne(query, getEntityClass(), collectionName);
    }

    public void save(T entity) {
        mongoTemplate.save(entity, collectionName);
    }

    public void remove(T entity){
        mongoTemplate.remove(entity,collectionName);
    }

    private Class<T> getEntityClass() {
        return ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }
}
