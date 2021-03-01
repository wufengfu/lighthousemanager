package com.edu.lighthouse.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "card_main")
public class CardMain {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 卡规则
     */
    @Column(name = "rule_id")
    private Integer ruleId;

    /**
     * 所属渠道（扩展字段）
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 所属渠道下会员
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 开卡渠道码（分销推广扩展码）
     */
    @Column(name = "rule_code")
    private String ruleCode;

    /**
     * 卡号
     */
    @Column(name = "card_code")
    private String cardCode;

    /**
     * 卡密
     */
    @Column(name = "card_password")
    private String cardPassword;

    /**
     * 获取类型：0-后台开通；1-自主申请
     */
    @Column(name = "get_type")
    private Integer getType;

    /**
     * 实际成交价格
     */
    @Column(name = "fact_price")
    private BigDecimal factPrice;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 使用状态：0-未激活；1-已激活；2-已过期
     */
    @Column(name = "use_status")
    private Integer useStatus;

    /**
     * 激活时间
     */
    @Column(name = "active_time")
    private Date activeTime;

    /**
     * 使用时间
     */
    @Column(name = "use_time")
    private Date useTime;

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
     * 获取卡规则
     *
     * @return rule_id - 卡规则
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * 设置卡规则
     *
     * @param ruleId 卡规则
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取所属渠道（扩展字段）
     *
     * @return channel_id - 所属渠道（扩展字段）
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 设置所属渠道（扩展字段）
     *
     * @param channelId 所属渠道（扩展字段）
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取所属渠道下会员
     *
     * @return user_id - 所属渠道下会员
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置所属渠道下会员
     *
     * @param userId 所属渠道下会员
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取开卡渠道码（分销推广扩展码）
     *
     * @return rule_code - 开卡渠道码（分销推广扩展码）
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置开卡渠道码（分销推广扩展码）
     *
     * @param ruleCode 开卡渠道码（分销推广扩展码）
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    /**
     * 获取卡号
     *
     * @return card_code - 卡号
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置卡号
     *
     * @param cardCode 卡号
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    /**
     * 获取卡密
     *
     * @return card_password - 卡密
     */
    public String getCardPassword() {
        return cardPassword;
    }

    /**
     * 设置卡密
     *
     * @param cardPassword 卡密
     */
    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword == null ? null : cardPassword.trim();
    }

    /**
     * 获取获取类型：0-后台开通；1-自主申请
     *
     * @return get_type - 获取类型：0-后台开通；1-自主申请
     */
    public Integer getGetType() {
        return getType;
    }

    /**
     * 设置获取类型：0-后台开通；1-自主申请
     *
     * @param getType 获取类型：0-后台开通；1-自主申请
     */
    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    /**
     * 获取实际成交价格
     *
     * @return fact_price - 实际成交价格
     */
    public BigDecimal getFactPrice() {
        return factPrice;
    }

    /**
     * 设置实际成交价格
     *
     * @param factPrice 实际成交价格
     */
    public void setFactPrice(BigDecimal factPrice) {
        this.factPrice = factPrice;
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
     * 获取使用状态：0-未激活；1-已激活；2-已过期
     *
     * @return use_status - 使用状态：0-未激活；1-已激活；2-已过期
     */
    public Integer getUseStatus() {
        return useStatus;
    }

    /**
     * 设置使用状态：0-未激活；1-已激活；2-已过期
     *
     * @param useStatus 使用状态：0-未激活；1-已激活；2-已过期
     */
    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    /**
     * 获取激活时间
     *
     * @return active_time - 激活时间
     */
    public Date getActiveTime() {
        return activeTime;
    }

    /**
     * 设置激活时间
     *
     * @param activeTime 激活时间
     */
    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * 获取使用时间
     *
     * @return use_time - 使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 设置使用时间
     *
     * @param useTime 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }
}