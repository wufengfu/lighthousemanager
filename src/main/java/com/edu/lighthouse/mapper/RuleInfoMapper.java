package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.RuleInfo;
import com.edu.lighthouse.pojo.vo.RuleInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wufengfu
 */
@Mapper
public interface RuleInfoMapper {

    /**
     * 获取所有在售卡规则信息
     * @return
     */
    List<RuleInfo> ruleList(RuleInfoVo ruleInfoVo);

}
