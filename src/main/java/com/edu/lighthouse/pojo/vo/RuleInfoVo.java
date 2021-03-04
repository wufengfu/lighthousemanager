package com.edu.lighthouse.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wufengfu
 */
@Data
@NoArgsConstructor
public class RuleInfoVo {

    private Integer ruleId;
    private Integer channelId;
    private Integer ruleStatus = 1;

}
