package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.Major;
import com.edu.lighthouse.pojo.vo.MajorBaseVo;
import com.edu.lighthouse.pojo.vo.MajorCountVo;
import com.edu.lighthouse.service.MajorService;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1/major")
public class MajorController {
    @Autowired
    MajorService majorService;

    private Logger log = LoggerFactory.getLogger(MajorController.class);

    @GetMapping("/listLargeCount")
    public Result listLarge(@RequestParam String undergraduate) {
        log.info("查询专业大类, undergraduate={}", undergraduate);
        List<MajorCountVo> list = majorService.listLargeCount(undergraduate);
        return Result.success(list);
    }

    @GetMapping("/listMajorBase")
    public Result listMajorBase(@RequestParam String undergraduate,
                                @RequestParam String majorName) {
        log.info("查询专业基础信息列表");
        List<MajorBaseVo> list = majorService.listMajorBase(undergraduate, majorName);
        return Result.success(list);
    }

    @GetMapping("/get")
    public Result get(@RequestParam String code) {
        log.info("查询专业详情，code={}", code);
        Preconditions.checkArgument(!Strings.isNullOrEmpty(code), "无效的专业代码");
        Major major = majorService.get(code);
        return Result.success(major);
    }


}
