package com.edu.lighthouse.pojo.vo;

/**
 * 专业大类统计（视图）: 仅显示名称、ID、count
 *
 * @author jinzc
 */
public class MajorCountVo{
    private int id;
    private String largeClassName;
    private int countChild;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLargeClassName() {
        return largeClassName;
    }

    public void setLargeClassName(String largeClassName) {
        this.largeClassName = largeClassName;
    }

    public int getCountChild() {
        return countChild;
    }

    public void setCountChild(int countChild) {
        this.countChild = countChild;
    }
}
