package org.seckill.service.redis;

import java.util.concurrent.TimeUnit;

/**
 * Created by lihuidong on 2018-3-11.
 */
public interface RedisService {

    void addValue(String key,String value);

    void addValue(String key, String value,final long offset);

    void addValue(String key, String value,final long timeout, final TimeUnit unit);

}
