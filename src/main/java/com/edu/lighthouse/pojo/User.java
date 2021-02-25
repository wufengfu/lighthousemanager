package com.edu.lighthouse.pojo;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * 用户
 *
 * @author jinzc
 */
public class User {
    private Integer id;
    private Date createTime;
    private Date updateTime;
    @NotEmpty(message = "用户名不允许为空")
    private String name;
    @NotEmpty(message = "密码不允许为空")
    private String pass;
    private String cardNo;
    private Integer delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass= pass;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
       return String.format("name=%s, pass=%s, cardNo=%s", getName(), getPass(), getCardNo());
    }
}
