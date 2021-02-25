package com.edu.lighthouse.conf;

import com.edu.lighthouse.constant.CommonConst;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;


/**
 * @author jinzc
 */
@Configuration
public class CacheConfig {

    @Bean("caffeine")
    public CacheManager caffeineCacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCaffeine(Caffeine.newBuilder().expireAfterWrite(CommonConst.CACHE_EXPIRE_TIME, TimeUnit.SECONDS));
        return cacheManager;
    }
}

