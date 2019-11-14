package com.chanpion.boot.neo4j;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author April Chen
 * @date 2019/11/7 19:10
 */
public interface Neo4jDAO {

    /**
     * 统计某种标签节点总数
     *
     * @param label 标签
     * @return
     */
    int count(@Param("label") String label);

    /**
     * 创建节点
     *
     * @param label
     * @param properties 属性列表
     */
    void create(@Param("label") String label, @Param("properties") Map<String, Object> properties);

    /**
     * 删除节点
     *
     * @param id
     */
    void deleteById(@Param("id") long id);

    /**
     * 查询节点
     *
     * @param label
     * @param startRow
     * @param pageSize
     * @return
     */
    List<JSONObject> findByLabel(String label, Long startRow, Integer pageSize);
}
