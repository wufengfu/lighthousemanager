package com.edu.lighthouse.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wufengfu
 */
@Data
@NoArgsConstructor
public class RuleInfo {

    private Integer id;

    /**
     * 所属渠道
     */
    private Integer channelId;

    /**
     * 卡标题
     */
    private String title;

    /**
     * 卡描述
     */
    private String detail;

    /**
     * 图片地址url
     */
    private String icon;

    /**
     * 规则类型：1-充值卡；
     */
    private Integer useType;

    /**
     * 产品规则
     */
    private CardBdProduct product;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 销售价
     */
    private BigDecimal salePrice;

    /**
     * 每人限开通张数
     */
    private Integer preLimit;

    /**
     * 规则状态：1-生效；2-强制时效（已发放的卡作废）3-已结束
     */
    private Integer status;

    private Date createTime;

    /**
     * 创建人
     */
    private String cerater;

    private Date lastUdpateTime;

    /**
     * 最后编辑人
     */
    private String lastUpdateUser;

}
