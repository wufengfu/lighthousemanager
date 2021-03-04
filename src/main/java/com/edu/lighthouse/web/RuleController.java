package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.CardInfo;
import com.edu.lighthouse.pojo.CardMain;
import com.edu.lighthouse.pojo.Major;
import com.edu.lighthouse.pojo.vo.CardBaseVo;
import com.edu.lighthouse.pojo.vo.CardInfoVo;
import com.edu.lighthouse.pojo.vo.MajorBaseVo;
import com.edu.lighthouse.pojo.vo.MajorCountVo;
import com.edu.lighthouse.service.CardService;
import com.edu.lighthouse.service.MajorService;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wufengfu
 */
@Validated
@RestController
@RequestMapping("/api/v1/card")
public class CardController {

    CardService cardService;

    private Logger log = LoggerFactory.getLogger(CardController.class);

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/listCard")
    public Result listLarge(CardBaseVo cardBaseVo) {
        log.info("查询卡列表, cardBaseVo={}", cardBaseVo);
        List<CardInfo> list = cardService.listCard(cardBaseVo);
        return Result.success(list);
    }
    @PostMapping("/add")
    public Result addCard(CardInfoVo cardInfo) {
        log.info("新增卡信息, cardBaseVo={}", cardInfo);
        CardMain cardMain = cardService.addCard(cardInfo);
        return Result.success(cardMain);
    }

}
