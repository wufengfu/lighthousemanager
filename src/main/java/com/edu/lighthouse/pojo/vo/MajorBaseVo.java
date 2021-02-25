package com.edu.lighthouse.pojo.vo;

import java.util.List;
import java.util.Map;

/**
 * 包含大类、次大类（子类）、孙子类基础信息
 *
 * @author jinzc
 */
public class MajorBaseVo {

    private String largeClassName;
    /**
     *  次大类列表
     */
    private List<MajorParentVo> parentVoList;

    public MajorBaseVo(String largeClassName, List<MajorParentVo> parentVoList) {
        this.largeClassName = largeClassName;
        this.parentVoList = parentVoList;
    }

    public String getLargeClassName() {
        return largeClassName;
    }

    public void setLargeClassName(String largeClassName) {
        this.largeClassName = largeClassName;
    }

    public List<MajorParentVo> getParentVoList() {
        return parentVoList;
    }

    public void setParentVoList(List<MajorParentVo> parentVoList) {
        this.parentVoList = parentVoList;
    }
}
