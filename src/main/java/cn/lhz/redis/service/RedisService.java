package cn.lhz.redis.service;

/**
 * @author lhz
 * @date 2019/11/19
 */
public interface RedisService {
    public void put(String key, Object value, long seconds);
    public Object get(String key);
}
