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
     * 卡描述
     */
    @Column(name = "detail")
    private String detail;

    /**
     * 图片地址url
     */
    @Column(name = "icon")
    private String icon;

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
     * 折扣
     */
    @Column(name = "discount")
    private BigDecimal discount;

    /**
     * 销售价
     */
    @Column(name = "sale_price")
    private BigDecimal salePrice;

    /**
     * 每人限开通张数
     */
    @Column(name = "pre_limit")
    private Integer preLimit;

    /**
     * 规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     */
    @Column(name = "status")
    private Integer status;

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
     * 获取卡描述
     *
     * @return detail - 卡描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置卡描述
     *
     * @param detail 卡描述
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取销售价
     *
     * @return sale_price - 销售价
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 设置销售价
     *
     * @param salePrice 销售价
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
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