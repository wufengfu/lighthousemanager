package com.edu.lighthouse.pojo.vo;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 次大类视图
 *
 * @author jinzc
 */
public class MajorParentVo {
    private String parentName;
    private String undergraduate;
    private String majorInfo;

    public String getUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(String undergraduate) {
        this.undergraduate = undergraduate;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getMajorInfo() {
        return majorInfo;
    }

    public void setMajorInfo(String majorInfo) {
        this.majorInfo = majorInfo;
    }

    public Map<String, String> toMap () {
        Map<String, String> map = Maps.newHashMap();
        map.put(parentName, majorInfo);
        return map;
    }
}
