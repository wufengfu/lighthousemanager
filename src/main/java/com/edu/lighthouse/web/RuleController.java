package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.CardInfo;
import com.edu.lighthouse.pojo.CardMain;
import com.edu.lighthouse.pojo.RuleInfo;
import com.edu.lighthouse.pojo.vo.CardBaseVo;
import com.edu.lighthouse.pojo.vo.CardInfoVo;
import com.edu.lighthouse.pojo.vo.RuleInfoVo;
import com.edu.lighthouse.service.CardService;
import com.edu.lighthouse.service.RuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wufengfu
 */
@Validated
@RestController
@RequestMapping("/api/v1/rule")
public class RuleController {

    RuleService ruleService;

    private Logger log = LoggerFactory.getLogger(RuleController.class);

    @Autowired
    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @GetMapping("/listRule")
    public Result listLarge(RuleInfoVo ruleInfoVo) {
        log.info("查询卡规则列表, ruleInfoVo={}", ruleInfoVo);
        List<RuleInfo> list = ruleService.listRule(ruleInfoVo);
        return Result.success(list);
    }
}
