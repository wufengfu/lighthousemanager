package com.edu.lighthouse.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "card_bd_product")
public class CardBdProduct {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 产品类型，固定表示数字码类型
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * 产品文字描述
     */
    @Column(name = "product_desc")
    private String productDesc;

    /**
     * 产品状态表示：1-有效；2-无效（则对卡全部失效）
     */
    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "creater")
    private String creater;

    @Column(name = "last_update_time")
    private Date lastUpdateTime;

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
     * 获取产品类型，固定表示数字码类型
     *
     * @return product_type - 产品类型，固定表示数字码类型
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置产品类型，固定表示数字码类型
     *
     * @param productType 产品类型，固定表示数字码类型
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取产品文字描述
     *
     * @return prodcut_desc - 产品文字描述
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * 设置产品文字描述
     *
     * @param productDesc 产品文字描述
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    /**
     * 获取产品状态表示：1-有效；2-无效（则对卡全部失效）
     *
     * @return product_status - 产品状态表示：1-有效；2-无效（则对卡全部失效）
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * 设置产品状态表示：1-有效；2-无效（则对卡全部失效）
     *
     * @param productStatus 产品状态表示：1-有效；2-无效（则对卡全部失效）
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
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
     * @return creater
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * @return last_update_time
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return last_update_user
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * @param lastUpdateUser
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }
}