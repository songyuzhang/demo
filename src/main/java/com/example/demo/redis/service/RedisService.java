package com.example.demo.redis.service;

/**
 * redis option
 * @author songyuzhang
 */
public interface RedisService {

    public void set(String key, String value);

    public String get(String key);

    public boolean delete(String key);

}
