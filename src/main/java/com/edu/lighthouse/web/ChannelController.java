package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.CardChannel;
import com.edu.lighthouse.pojo.RuleInfo;
import com.edu.lighthouse.pojo.vo.RuleInfoVo;
import com.edu.lighthouse.service.ChannelService;
import com.edu.lighthouse.service.RuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wufengfu
 */
@Validated
@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {

    ChannelService channelService;

    private Logger log = LoggerFactory.getLogger(ChannelController.class);

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @GetMapping("/listChannel")
    public Result listLarge() {
        log.info("查询渠道列表");
        List<CardChannel> channelList = channelService.listChannel();
        return Result.success(channelList);
    }
}
