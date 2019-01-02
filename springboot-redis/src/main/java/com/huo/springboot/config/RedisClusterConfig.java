package com.huo.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.LinkedHashSet;
import java.util.Set;

@Configuration
public class RedisClusterConfig {
    @Autowired
    private Environment environment;

    @Bean
    public JedisCluster jedisCluster(){
        //添加redis连接节点
        Set<HostAndPort> hostAndPortSet = new LinkedHashSet<>( );
     //   hostAndPortSet.add(  )
        JedisCluster cluster = new JedisCluster(hostAndPortSet);

        return cluster;

    }
}
