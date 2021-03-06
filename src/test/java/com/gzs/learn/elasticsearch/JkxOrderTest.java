package com.gzs.learn.elasticsearch;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.gzs.learn.elasticsearch.domain.JkxOrder;
import com.gzs.learn.elasticsearch.repository.JkxRepository;

@RunWith(SpringRunner.class)
public class JkxOrderTest {
    @Autowired
    private JkxRepository jkxRepository;

    @Test
    public void testFindById() {
        final String orderId = "J0134733074244323";
        final JkxOrder order = jkxRepository.findOne(orderId);
        Assert.assertNotNull(order);
        System.out.println(JSON.toJSONString(order));
    }
}
