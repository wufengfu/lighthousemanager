package com.edu.lighthouse.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 用户 视图
 *
 * @author jinzc
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRegVo {
    private Integer id;
    private String name;
    private String pass;
    private String cardNo;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
