package org.seckill.redis;

import org.junit.Test;
import org.seckill.BaseTest;
import org.seckill.service.redis.impl.Redis4TempServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lihuidong on 2018-3-11.
 */
public class RedisServiceTest extends BaseTest {

    @Autowired
    private Redis4TempServiceImpl redisService;
    @Test
    public void testValue() {
//        redisService.addValue("b", "bbbb", 60);
//        HashSet<String> set=new HashSet<>();
//        set.add("asad");
//        set.add("sasa");
//        redisService.cacheSet("aaaa",set);

       Long i = redisService.cacheSet("cccc","aaaasd");
        System.out.println("------------------"+i);
    }
}
