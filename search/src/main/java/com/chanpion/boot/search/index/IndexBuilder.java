package com.chanpion.boot.search.index;

import com.chanpion.boot.search.entity.User;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;

/**
 * @author April Chen
 * @date 2019/9/17 14:19
 */
@Component
public class IndexBuilder {

    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;

    public void build() {
        if (!elasticsearchTemplate.indexExists("user")) {
            elasticsearchTemplate.createIndex("user");
        }

        User u1 = new User("chen", 20);
        User u2 = new User("li", 30);
        IndexQuery indexQuery = new IndexQueryBuilder().withObject(u1).build();
        elasticsearchTemplate.index(indexQuery);
        IndexQuery indexQuery2 = new IndexQueryBuilder().withObject(u2).build();
        elasticsearchTemplate.bulkIndex(Collections.singletonList(indexQuery2));
    }
}
