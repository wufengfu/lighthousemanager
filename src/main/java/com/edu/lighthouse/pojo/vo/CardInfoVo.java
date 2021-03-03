package com.edu.lighthouse.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wufengfu
 */
@Data
@NoArgsConstructor
public class CardInfoVo {

    private Integer ruleId;
    private Integer channelId;
    private Integer userId;
    private String ruleCode;
    private Integer getType;
    private Double factPrice;

}
