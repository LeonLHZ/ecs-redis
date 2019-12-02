package cn.lhz.redis.controller;

import cn.lhz.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lhz
 * @date 2019/11/19
 */
@RestController
public class RedisController {

    private static final String RESULT_OK = "ok";

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "put", method = RequestMethod.POST)
    public String put(String key, String value, long seconds) {
        redisService.put(key, value, seconds);
        return RESULT_OK;
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(String key) {
        String json =null;
        Object obj = redisService.get(key);
        if (obj != null) {
           json = (String) redisService.get(key);

        }

        return json;
    }
}
