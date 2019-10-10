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
    // MATCH (person:Person {name={0}}) RETURN person
    Person findByName(String name);

    // MATCH (person:Person)
    // WHERE person.age = {0} AND person.married = {1}
    // RETURN person
    Iterable<Person> findByAgeAndMarried(int age, boolean married);

    // MATCH (person:Person)
    // WHERE person.age = {0}
    // RETURN person ORDER BY person.name SKIP {skip} LIMIT {limit}
    Page<Person> findByAge(int age, Pageable pageable);

    // MATCH (person:Person)
    // WHERE person.age = {0}
    // RETURN person ORDER BY person.name
    List<Person> findByAge(int age, Sort sort);

    // Allow a custom depth as a parameter
    Person findByName(String name, @Depth int depth);

    // Set a fix depth of 0 for the query
    @Depth(value = 0)
    Person findBySurname(String surname);
}
