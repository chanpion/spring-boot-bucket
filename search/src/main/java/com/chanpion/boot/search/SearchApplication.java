package com.chanpion.boot.search;

import com.chanpion.boot.search.index.IndexBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2019/9/17 14:14
 */
@SpringBootApplication
public class SearchApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

    @Resource
    private IndexBuilder indexBuilder;

    @Override
    public void run(String... args) throws Exception {
        try {
            indexBuilder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
