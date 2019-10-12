package com.chanpion.boot.neo4j.dao;

import com.chanpion.boot.neo4j.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * @author April Chen
 * @date 2019/10/8 10:34
 */
public interface PersonRepository extends Neo4jRepository<Person, Long> {
    Person findByName(String name);
}
