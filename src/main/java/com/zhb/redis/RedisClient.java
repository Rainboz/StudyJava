package com.zhb.redis;


import redis.clients.jedis.Jedis;

public class RedisClient {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("47.100.9.160",6379);
        //jedis.append("name","1");
        jedis.auth("redis");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        jedis.close();
        Jedis jedis1 = new Jedis("127.0.0.1");
        System.out.println("连接成功");
        System.out.println("服务正在运行："+jedis1.ping());
        jedis1.close();

    }
}
