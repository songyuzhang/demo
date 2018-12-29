package com.example.demo.redis.service.impl;

import com.example.demo.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public RedisServiceImpl() {
        //stringRedisTemplate.setDefaultSerializer();
    }

    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().append(key, value);
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean delete(String key) {
        return stringRedisTemplate.delete(key);
    }


}
