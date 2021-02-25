package com.edu.lighthouse.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author wufengfu
 */
@Data
@NoArgsConstructor
public class CardInfo {

    private Integer id;
    private CardRule cardRule;
    private CardChannel cardChannel;
    private CardBdProduct cardBdProduct;
    private CardAccount cardAccount;
    private User user;
    private String ruleCode;
    private String cardCode;
    private String cardPassword;

    /**
     * 获取类型：0-后台开通；1-自主申请
     */
    private Integer getType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 使用状态：0-未激活；1-已激活；2-已过期
     */
    private Integer useStatus;

    /**
     * 激活时间
     */
    private Date activeTime;

    /**
     * 使用时间
     */
    private Date useTime;


}
