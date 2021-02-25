package com.edu.lighthouse.constant;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import org.springframework.core.env.StandardEnvironment;

import java.util.List;
import java.util.Map;

/**
 * 基础常量
 * @author jinzc
 */
public class CommonConst {
    /**
     * caffeine cache 有效时长(单位：秒)
     */
    public static final Integer CACHE_EXPIRE_TIME = 7 * 24 * 60 * 1_000;
    /**
     * 默认每页条目数
     */
    public static final Integer DEFAULT_PAGE_SIZE = 10;
}
