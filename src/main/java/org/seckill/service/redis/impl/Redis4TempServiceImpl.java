package org.seckill.service.redis.impl;

import org.seckill.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by lihuidong on 2018-3-11.
 */
@Component
public class Redis4TempServiceImpl implements RedisService {

    @Autowired @Qualifier("redis4Temp")
    private RedisTemplate redis4Temp;
    @Override
    public void addValue(String key, String value) {
        //TODO 可添加业务处理
        redis4Temp.opsForValue().set(key,value);
    }

    @Override
    public void addValue(String key, String value,final long offset){
        redis4Temp.opsForValue().set(key,value,offset);
    }

    @Override
    public void addValue(String key, String value,final long timeout, final TimeUnit unit){
        redis4Temp.opsForValue().set(key,value,timeout,unit);
    }

    public Long cacheSet(String key, Set<String> set){
        SetOperations setOps = redis4Temp.opsForSet();
        return setOps.add(key,set.toArray(new String[set.size()]));
    }

    public Long cacheSet(String key, Object strArray){
        SetOperations setOps = redis4Temp.opsForSet();
       return setOps.add(key,strArray);
    }
}
