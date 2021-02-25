package com.edu.lighthouse.pojo;

/**
 * 院校实体类(字段含义，可参照数据库表school)
 *
 * @author jinzc
 */
public class School {
    private int id;
    private String name;
    private String type;
    private String subjection;
    private String property;
    private String location;
    private String foundingTime;
    private Boolean is985;
    private Boolean is211;
    private Boolean doubleTops;
    private String undergraduate;
    private String masterSections;
    private String doctorSections;
    private String introduction;
    private String schoolBadge;
    private String nationalMajor;
    private String provincialMajor;
    private String college;

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

    public String getSubjection() {
        return subjection;
    }

    public void setSubjection(String subjection) {
        this.subjection = subjection;
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

    public String getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(String foundingTime) {
        this.foundingTime = foundingTime;
    }

    public Boolean getIs985() {
        return is985;
    }

    public void setIs985(Boolean is985) {
        this.is985 = is985;
    }

    public Boolean getIs211() {
        return is211;
    }

    public void setIs211(Boolean is211) {
        this.is211 = is211;
    }

    public Boolean getDoubleTops() {
        return doubleTops;
    }

    public void setDoubleTops(Boolean doubleTops) {
        this.doubleTops = doubleTops;
    }

    public String getUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(String undergraduate) {
        this.undergraduate = undergraduate;
    }

    public String getMasterSections() {
        return masterSections;
    }

    public void setMasterSections(String masterSections) {
        this.masterSections = masterSections;
    }

    public String getDoctorSections() {
        return doctorSections;
    }

    public void setDoctorSections(String doctorSections) {
        this.doctorSections = doctorSections;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSchoolBadge() {
        return schoolBadge;
    }

    public void setSchoolBadge(String schoolBadge) {
        this.schoolBadge = schoolBadge;
    }

    public String getNationalMajor() {
        return nationalMajor;
    }

    public void setNationalMajor(String nationalMajor) {
        this.nationalMajor = nationalMajor;
    }

    public String getProvincialMajor() {
        return provincialMajor;
    }

    public void setProvincialMajor(String provincialMajor) {
        this.provincialMajor = provincialMajor;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
