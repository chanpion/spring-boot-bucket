package com.chanpion.boot.neo4j;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Config;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.net.ServerAddress;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author April Chen
 * @date 2019/10/29 14:04
 */
public class Neo4jDriver {

    public void createDriver(String uri, String user, String password, ServerAddress addresses) {
        Config config = Config.builder()
                .withResolver(address -> new HashSet<>(Arrays.asList(addresses)))
                .build();
        GraphDatabase.driver(uri, AuthTokens.basic(user, password), config);
    }
}
