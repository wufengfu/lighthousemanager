package com.edu.lighthouse.service;

import com.edu.lighthouse.helper.OrgCodeGenerator;
import com.edu.lighthouse.helper.security.Encryption;
import com.edu.lighthouse.mapper.CardInfoMapper;
import com.edu.lighthouse.mapper.RuleInfoMapper;
import com.edu.lighthouse.pojo.CardInfo;
import com.edu.lighthouse.pojo.CardMain;
import com.edu.lighthouse.pojo.RuleInfo;
import com.edu.lighthouse.pojo.vo.CardBaseVo;
import com.edu.lighthouse.pojo.vo.CardInfoVo;
import com.edu.lighthouse.pojo.vo.RuleInfoVo;
import com.edu.lighthouse.struct.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wufengfu
 */
@Service
public class RuleService {

    RuleInfoMapper ruleInfoMapper;

    @Autowired
    public RuleService(RuleInfoMapper ruleInfoMapper) {
        this.ruleInfoMapper = ruleInfoMapper;
    }

    public List<RuleInfo> listRule(RuleInfoVo ruleInfoVo) {

        return ruleInfoMapper.ruleList(ruleInfoVo);
    }

}
