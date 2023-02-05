package com.sichuantao.chatbot.api;


import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/*
单元测试
 */
public class ApiTest {
    @Test
    public void query_unanswered_question() throws IOException {

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/88858554122822/topics?scope=unanswered_questions&count=20");

        get.addHeader("cookie","zsxq_access_token=A79DE3C0-28FA-CB1C-FA65-FCCDAC408DE2_B6F6C892B1FCA2F5; zsxqsessionid=7c7e5133f6f059628089407f542fcda2; UM_distinctid=185f8800f51370-0bc3b8e983e156-26021051-144000-185f8800f5232f; sensorsdata2015jssdkcross={\"distinct_id\":\"421144142281228\",\"first_id\":\"185f141e0ef60a-00cac363853b7cd-26021051-1327104-185f141e0f0476\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg1ZjE0MWUwZWY2MGEtMDBjYWMzNjM4NTNiN2NkLTI2MDIxMDUxLTEzMjcxMDQtMTg1ZjE0MWUwZjA0NzYiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MjExNDQxNDIyODEyMjgifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"421144142281228\"},\"$device_id\":\"185f141e0ef60a-00cac363853b7cd-26021051-1327104-185f141e0f0476\"}; abtest_env=product");
        get.addHeader("Content-Type","application/json; charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);

        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/181551551181482/answer");
        post.addHeader("cookie","zsxq_access_token=A79DE3C0-28FA-CB1C-FA65-FCCDAC408DE2_B6F6C892B1FCA2F5; zsxqsessionid=7c7e5133f6f059628089407f542fcda2; UM_distinctid=185f8800f51370-0bc3b8e983e156-26021051-144000-185f8800f5232f; sensorsdata2015jssdkcross={\"distinct_id\":\"421144142281228\",\"first_id\":\"185f141e0ef60a-00cac363853b7cd-26021051-1327104-185f141e0f0476\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg1ZjE0MWUwZWY2MGEtMDBjYWMzNjM4NTNiN2NkLTI2MDIxMDUxLTEzMjcxMDQtMTg1ZjE0MWUwZjA0NzYiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI0MjExNDQxNDIyODEyMjgifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"421144142281228\"},\"$device_id\":\"185f141e0ef60a-00cac363853b7cd-26021051-1327104-185f141e0f0476\"}; abtest_env=product");
        post.addHeader("Content-Type","application/json; charset=utf8");


        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"我也不会\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": true\n" +
                "  }\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());//{"succeeded":true,"resp_data":{"topic":{"topic_id":814884882144582,"group":{"group_id":88858554122822,"name":"\u6211\u7684\u670b\u53cb\u4eec","type":"pay"},"type":"q&a","question":{"owner":{"user_id":812555242448152,"name":"\u53f8\u4f20\u6d9b","avatar_url":"https:\/\/images.zsxq.com\/Fi8vSgAVIXbMiTXOXN7Us6lZRq_Q?e=1680278399&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:xT_QJhe7QxwmWa-xKqqXMPbdrR4=","location":"\u5c71\u897f"},"questionee":{"user_id":421144142281228,"name":"\u5c0f\u53f8","avatar_url":"https:\/\/images.zsxq.com\/FnNPYnFXXjJlKimYcJ26oIvCpXAY?e=1680278399&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:goL9rl0VQI81jyNnVo0jHHlvr34=","location":"\u5c71\u897f"},"text":"\u8bf7\u8ba4\u771f\u5e2e\u6211\u5199\u4e00\u4e2aJava\u5192\u6ce1\u6392\u5e8f","expired":false,"anonymous":false,"owner_detail":{"questions_count":2,"join_time":"2023-02-04T16:32:09.661+0800"},"owner_location":"\u5c71\u897f"},"answer":{"owner":{"user_id":421144142281228,"name":"\u5c0f\u53f8","avatar_url":"https:\/\/images.zsxq.com\/FnNPYnFXXjJlKimYcJ26oIvCpXAY?e=1680278399&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:goL9rl0VQI81jyNnVo0jHHlvr34=","location":"\u5c71\u897f"},"text":"\ufffd\ufffd\u04b2\ufffd\ufffd\ufffd\u18e1"},"answered":true,"silenced":false,"likes_count":0,"rewards_count":0,"comments_count":0,"reading_count":1,"readers_count":2,"digested":false,"sticky":false,"create_time":"2023-02-04T20:52:37.126+0800","user_specific":{"liked":false,"subscribed":false}}}}

        }
    }


    @Test
    public void test_chatGPT() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.openai.com/v1/completions");
        post.addHeader("Content-Type", "application/json");
        post.addHeader("Authorization", "Bearer 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");

        // 请求信息
        String paramJson = "{\"model\": \"text-davinci-003\", \"prompt\": \"帮我写一个java冒泡排序\", \"temperature\": 0, \"max_tokens\": 1024}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }

}
