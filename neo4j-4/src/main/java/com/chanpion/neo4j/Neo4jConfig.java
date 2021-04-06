package com.chanpion.neo4j;

import org.neo4j.driver.*;

/**
 * @author April Chen
 * @date 2020/2/26 13:39
 */

public class Neo4jConfig {

    public void driver() {
        GraphDatabase.driver("neo4j://localhost:7687", AuthTokens.basic("neo4j", "123456"));
    }

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("neo4j://172.19.80.53:7687", AuthTokens.basic("neo4j", "neo4j"));
        driver.verifyConnectivity();
        System.out.println(driver.supportsMultiDb());
        SessionConfig sessionConfig = SessionConfig.builder()
                .withDatabase("system")
                .withDefaultAccessMode(AccessMode.WRITE)
                .build();
        Session session = driver.session(sessionConfig);
        Result result = session.run("show databases");
        while (result.hasNext()) {
            Record record = result.next();
            System.out.println(record);
        }
        result = session.run("drop database test");
        while (result.hasNext()) {
            Record record = result.next();
            System.out.println(record);
        }
    }
}
