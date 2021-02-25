package com.edu.lighthouse.service;

import com.edu.lighthouse.mapper.SchoolMapper;
import com.edu.lighthouse.pojo.School;
import com.edu.lighthouse.pojo.vo.SchoolBaseVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    SchoolMapper schoolMapper;

    @Cacheable(cacheManager = "caffeine", value = "locationList")
    public List<String> listLocation() {
        return schoolMapper.listLocation();
    }

    @Cacheable(cacheManager = "caffeine", value = "typeList")
    public List<String> listType() {
        return schoolMapper.listType();
    }

    @Cacheable(cacheManager = "caffeine", value = "propertyList")
    public List<String> listProperty() {
        return schoolMapper.listProperty();
    }

    public School get(int id) {
        return schoolMapper.get(id);
    }

    public List<SchoolBaseVo> list(SchoolBaseVo params) {
        // 将前端传递已逗号分割的location，替换为｜，为了便于sql 正则匹配
        if (StringUtils.isNotEmpty(params.getLocation())) {
            params.setLocation(params.getLocation().replace(",", "|"));
        }
        return schoolMapper.list(params);
    }
}
