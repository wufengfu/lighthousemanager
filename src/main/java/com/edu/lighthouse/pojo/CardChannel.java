package com.edu.lighthouse.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "card_channel")
public class CardChannel {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 渠道编码
     */
    @Column(name = "channel_code")
    private String channelCode;

    /**
     * 渠道描述
     */
    @Column(name = "channel_name")
    private String channelName;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    /**
     * 加密密钥
     */
    @Column(name = "aesen_code")
    private String aesenCode;

    /**
     * 解密密钥
     */
    @Column(name = "aesdn_code")
    private String aesdnCode;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "creater")
    private String creater;

    /**
     * 最后编辑时间
     */
    @Column(name = "last_udpate_time")
    private Date lastUdpateTime;

    /**
     * 最后编辑人
     */
    @Column(name = "last_udpate_user")
    private String lastUdpateUser;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取渠道编码
     *
     * @return channel_code - 渠道编码
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 设置渠道编码
     *
     * @param channelCode 渠道编码
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * 获取渠道描述
     *
     * @return channel_name - 渠道描述
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置渠道描述
     *
     * @param channelName 渠道描述
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 获取加密密钥
     *
     * @return aesen_code - 加密密钥
     */
    public String getAesenCode() {
        return aesenCode;
    }

    /**
     * 设置加密密钥
     *
     * @param aesenCode 加密密钥
     */
    public void setAesenCode(String aesenCode) {
        this.aesenCode = aesenCode == null ? null : aesenCode.trim();
    }

    /**
     * 获取解密密钥
     *
     * @return aesdn_code - 解密密钥
     */
    public String getAesdnCode() {
        return aesdnCode;
    }

    /**
     * 设置解密密钥
     *
     * @param aesdnCode 解密密钥
     */
    public void setAesdnCode(String aesdnCode) {
        this.aesdnCode = aesdnCode == null ? null : aesdnCode.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return creater - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * 获取最后编辑时间
     *
     * @return last_udpate_time - 最后编辑时间
     */
    public Date getLastUdpateTime() {
        return lastUdpateTime;
    }

    /**
     * 设置最后编辑时间
     *
     * @param lastUdpateTime 最后编辑时间
     */
    public void setLastUdpateTime(Date lastUdpateTime) {
        this.lastUdpateTime = lastUdpateTime;
    }

    /**
     * 获取最后编辑人
     *
     * @return last_udpate_user - 最后编辑人
     */
    public String getLastUdpateUser() {
        return lastUdpateUser;
    }

    /**
     * 设置最后编辑人
     *
     * @param lastUdpateUser 最后编辑人
     */
    public void setLastUdpateUser(String lastUdpateUser) {
        this.lastUdpateUser = lastUdpateUser == null ? null : lastUdpateUser.trim();
    }
}