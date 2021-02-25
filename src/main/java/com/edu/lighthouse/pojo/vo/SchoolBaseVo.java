package com.edu.lighthouse.pojo.vo;

/**
 * 学校列表（视图）
 *
 * @author jinzc
 */
public class SchoolBaseVo {
    private int id;
    private String name;
    private String type;
    private String undergraduate;
    private String subjection;
    private String property;
    private String location;
    private String schoolBadge;
    private Boolean is211=false;
    private Boolean is985=false;
    private Boolean doubleTops=false;

    private int page=1;

    public String getSubjection() {
        return subjection;
    }

    public void setSubjection(String subjection) {
        this.subjection = subjection;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Boolean getIs211() {
        return is211;
    }

    public void setIs211(Boolean is211) {
        this.is211 = is211;
    }

    public Boolean getIs985() {
        return is985;
    }

    public void setIs985(Boolean is985) {
        this.is985 = is985;
    }

    public Boolean getDoubleTops() {
        return doubleTops;
    }

    public void setDoubleTops(Boolean doubleTops) {
        this.doubleTops = doubleTops;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(String undergraduate) {
        this.undergraduate = undergraduate;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchoolBadge() {
        return schoolBadge;
    }

    public void setSchoolBadge(String schoolBadge) {
        this.schoolBadge = schoolBadge;
    }
}
