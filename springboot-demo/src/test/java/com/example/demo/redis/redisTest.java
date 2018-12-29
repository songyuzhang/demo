package com.example.demo.redis;

import com.example.demo.redis.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void testRedisSetString(){

        redisService.set("test"+System.currentTimeMillis(), "SUCCESS");
    }

    @Test
    public void testRedisGetString(){
        String value = redisService.get("test1545031453753");
        System.out.println(value);
    }

    @Test
    public void testRedisDelete(){
        boolean result = redisService.delete("test1545031453753");
        System.out.println(result);
    }


}
