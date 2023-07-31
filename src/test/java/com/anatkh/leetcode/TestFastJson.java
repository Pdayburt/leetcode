package com.anatkh.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestFastJson {

    @Test
    public void testJason() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","jack");
        jsonObject.put("age",18L);
        System.out.println(jsonObject.toJSONString());

    }

}
