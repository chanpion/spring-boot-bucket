package com.chanpion.boot.neo4j.entity;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @author April Chen
 * @date 2019/10/8 10:18
 */
@NodeEntity(label = "Movie")
public class Movie {

    @Id
    private Long nodeId;

    @Property(name = "title")
    private String title;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
