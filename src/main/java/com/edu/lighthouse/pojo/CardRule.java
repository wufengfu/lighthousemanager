package com.edu.lighthouse.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "card_rule")
public class CardRule {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 所属渠道
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 卡标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 图片地址url
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 发卡券码
     */
    @Column(name = "rule_code")
    private String ruleCode;

    /**
     * 领取开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 领取结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 发行数量
     */
    @Column(name = "publish_count")
    private Integer publishCount;

    /**
     * 已使用数量
     */
    @Column(name = "use_count")
    private Integer useCount;

    /**
     * 已领取数量
     */
    @Column(name = "receive_count")
    private Integer receiveCount;

    /**
     * 规则类型：1-充值卡；
     */
    @Column(name = "use_type")
    private Integer useType;

    /**
     * 适用产品规则：参考产品规则基础数据表，为0则无限制
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * 每人限开通张数
     */
    @Column(name = "pre_limit")
    private Integer preLimit;

    /**
     * 金额规则（满减类型时有效）为0则代表无限制门槛券
     */
    @Column(name = "amount_rule")
    private BigDecimal amountRule;

    /**
     * 时效类型：1:绝对有效；2:相对有效（领取后N天有效）
     */
    @Column(name = "valid_type")
    private Integer validType;

    /**
     * 优惠券有效开始时间
     */
    @Column(name = "valid_start_time")
    private Date validStartTime;

    /**
     * 优惠券有效结束时间
     */
    @Column(name = "valid_end_time")
    private Date validEndTime;

    /**
     * 自领取之日有效天数
     */
    @Column(name = "valid_days")
    private Integer validDays;

    /**
     * 规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "cerater")
    private String cerater;

    @Column(name = "last_udpate_time")
    private Date lastUdpateTime;

    /**
     * 最后编辑人
     */
    @Column(name = "last_update_user")
    private String lastUpdateUser;

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
     * 获取所属渠道
     *
     * @return channel_id - 所属渠道
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 设置所属渠道
     *
     * @param channelId 所属渠道
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取卡标题
     *
     * @return title - 卡标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置卡标题
     *
     * @param title 卡标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取图片地址url
     *
     * @return icon - 图片地址url
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图片地址url
     *
     * @param icon 图片地址url
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取发卡券码
     *
     * @return rule_code - 发卡券码
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置发卡券码
     *
     * @param ruleCode 发卡券码
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    /**
     * 获取领取开始时间
     *
     * @return start_time - 领取开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置领取开始时间
     *
     * @param startTime 领取开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取领取结束时间
     *
     * @return end_time - 领取结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置领取结束时间
     *
     * @param endTime 领取结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取发行数量
     *
     * @return publish_count - 发行数量
     */
    public Integer getPublishCount() {
        return publishCount;
    }

    /**
     * 设置发行数量
     *
     * @param publishCount 发行数量
     */
    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    /**
     * 获取已使用数量
     *
     * @return use_count - 已使用数量
     */
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * 设置已使用数量
     *
     * @param useCount 已使用数量
     */
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    /**
     * 获取已领取数量
     *
     * @return receive_count - 已领取数量
     */
    public Integer getReceiveCount() {
        return receiveCount;
    }

    /**
     * 设置已领取数量
     *
     * @param receiveCount 已领取数量
     */
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    /**
     * 获取规则类型：1-充值卡；
     *
     * @return use_type - 规则类型：1-充值卡；
     */
    public Integer getUseType() {
        return useType;
    }

    /**
     * 设置规则类型：1-充值卡；
     *
     * @param useType 规则类型：1-充值卡；
     */
    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    /**
     * 获取适用产品规则：参考产品规则基础数据表，为0则无限制
     *
     * @return product_type - 适用产品规则：参考产品规则基础数据表，为0则无限制
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置适用产品规则：参考产品规则基础数据表，为0则无限制
     *
     * @param productType 适用产品规则：参考产品规则基础数据表，为0则无限制
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取每人限开通张数
     *
     * @return pre_limit - 每人限开通张数
     */
    public Integer getPreLimit() {
        return preLimit;
    }

    /**
     * 设置每人限开通张数
     *
     * @param preLimit 每人限开通张数
     */
    public void setPreLimit(Integer preLimit) {
        this.preLimit = preLimit;
    }

    /**
     * 获取金额规则（满减类型时有效）为0则代表无限制门槛券
     *
     * @return amount_rule - 金额规则（满减类型时有效）为0则代表无限制门槛券
     */
    public BigDecimal getAmountRule() {
        return amountRule;
    }

    /**
     * 设置金额规则（满减类型时有效）为0则代表无限制门槛券
     *
     * @param amountRule 金额规则（满减类型时有效）为0则代表无限制门槛券
     */
    public void setAmountRule(BigDecimal amountRule) {
        this.amountRule = amountRule;
    }

    /**
     * 获取时效类型：1:绝对有效；2:相对有效（领取后N天有效）
     *
     * @return valid_type - 时效类型：1:绝对有效；2:相对有效（领取后N天有效）
     */
    public Integer getValidType() {
        return validType;
    }

    /**
     * 设置时效类型：1:绝对有效；2:相对有效（领取后N天有效）
     *
     * @param validType 时效类型：1:绝对有效；2:相对有效（领取后N天有效）
     */
    public void setValidType(Integer validType) {
        this.validType = validType;
    }

    /**
     * 获取优惠券有效开始时间
     *
     * @return valid_start_time - 优惠券有效开始时间
     */
    public Date getValidStartTime() {
        return validStartTime;
    }

    /**
     * 设置优惠券有效开始时间
     *
     * @param validStartTime 优惠券有效开始时间
     */
    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    /**
     * 获取优惠券有效结束时间
     *
     * @return valid_end_time - 优惠券有效结束时间
     */
    public Date getValidEndTime() {
        return validEndTime;
    }

    /**
     * 设置优惠券有效结束时间
     *
     * @param validEndTime 优惠券有效结束时间
     */
    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    /**
     * 获取自领取之日有效天数
     *
     * @return valid_days - 自领取之日有效天数
     */
    public Integer getValidDays() {
        return validDays;
    }

    /**
     * 设置自领取之日有效天数
     *
     * @param validDays 自领取之日有效天数
     */
    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    /**
     * 获取规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     *
     * @return status - 规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     *
     * @param status 规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return cerater - 创建人
     */
    public String getCerater() {
        return cerater;
    }

    /**
     * 设置创建人
     *
     * @param cerater 创建人
     */
    public void setCerater(String cerater) {
        this.cerater = cerater == null ? null : cerater.trim();
    }

    /**
     * @return last_udpate_time
     */
    public Date getLastUdpateTime() {
        return lastUdpateTime;
    }

    /**
     * @param lastUdpateTime
     */
    public void setLastUdpateTime(Date lastUdpateTime) {
        this.lastUdpateTime = lastUdpateTime;
    }

    /**
     * 获取最后编辑人
     *
     * @return last_update_user - 最后编辑人
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * 设置最后编辑人
     *
     * @param lastUpdateUser 最后编辑人
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }
}