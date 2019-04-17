package com.zhb.redis;

import com.zhb.redis.Util.RedisUtil;
import org.junit.Test;

public class RedisTest {
    @Test
    public void demo1(){
        for (int i = 0; i < 5; i++) {
            RedisUtil.getJedis().set("age"+i, String.valueOf(i*i));
            String s = RedisUtil.getJedis().get("age"+i);
            System.out.println(s);
        }
//        RedisUtil.getJedis().set("age","22");
//        String s = RedisUtil.getJedis().get("age");
//        System.out.println(s);
        RedisUtil.getJedis().close();
    }
}
