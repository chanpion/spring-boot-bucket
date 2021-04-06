package com.chanpion.boot.search.index;

import com.alibaba.fastjson.JSON;
import com.chanpion.boot.search.entity.User;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author April Chen
 * @date 2019/9/17 14:19
 */
@Component
public class IndexBuilder {

    @Resource
    private RestHighLevelClient restHighLevelClient;

    public void build() throws IOException {
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("es");
        CreateIndexResponse response = restHighLevelClient.indices()
                .create(createIndexRequest, RequestOptions.DEFAULT);
        System.out.println(response);
        User u1 = new User("chen", 20);
        User u2 = new User("li", 30);

        IndexRequest request = new IndexRequest("es");
        request.id("1");
        request.timeout(TimeValue.timeValueSeconds(1));
        request.timeout("1s");
        //将我们的数据放入请求，json
        request.source(XContentType.JSON, JSON.toJSONString(u1), JSON.toJSONString(u2));
        //客服端发送请求
        IndexResponse index = restHighLevelClient.index(request, RequestOptions.DEFAULT);
        System.out.println(index.toString());
        //对应我们的命令返回状态
        System.out.println(index.status());
    }
}
