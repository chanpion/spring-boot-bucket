package com.chanpion.boot.search.controller;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author April Chen
 * @date 2020/6/8 10:35
 */
@RestController
public class SearchController {
    @Resource
    private RestHighLevelClient client;

    @RequestMapping("/search/{name}")
    public Object search(@PathVariable String name) throws IOException {
        SearchRequest searchRequest = new SearchRequest();
        TermQueryBuilder termQuery = QueryBuilders.termQuery("username", name);
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(termQuery);
        searchRequest.source();
        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        System.out.println(searchResponse);
        return searchResponse;
    }
}
