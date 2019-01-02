package com.huo.springboot;

import com.huo.springboot.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.LinkedHashSet;
import java.util.Set;

public class RedisTemplateTest extends SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTemplate(){
        User user = new User();
        user.setName( "刘二" );
        user.setAge( "23" );
        long mills = System.currentTimeMillis();
        redisTemplate.opsForValue().set( mills, "666");
        System.out.println("结束");

    }
}
