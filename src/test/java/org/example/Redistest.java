package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class Redistest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

//    @Test
//    public void testSet() {
//        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
//        operations.set("name","zhangshan");
//    }
}