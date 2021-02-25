package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.School;
import com.edu.lighthouse.pojo.vo.SchoolBaseVo;
import com.edu.lighthouse.service.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jinzc
 */
@Validated
@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    private Logger log = LoggerFactory.getLogger(SchoolController.class);

    @GetMapping("/listLocation")
    public Result listLocation() {
        log.info("获取院校地域列表");
        List<String> locations =schoolService.listLocation();
        return Result.success(locations);
    }

    @GetMapping("/listType")
    public Result listType() {
        log.info("获取院校类型列表");
        List<String> typeList =schoolService.listType();
        return Result.success(typeList);
    }

    @GetMapping("/listProperty")
    public Result listProperty() {
        log.info("获取院校性质列表");
        List<String> propList =schoolService.listProperty();
        return Result.success(propList);
    }

    @GetMapping("/list")
    public Result list(@ModelAttribute SchoolBaseVo params) {
        log.info("获取院校列表");
        List<SchoolBaseVo> schoolList =schoolService.list(params);
        return Result.success(schoolList);
    }

    @GetMapping("/get")
    public Result get(@RequestParam int id) {
        log.info("获取院校详情,id={}",id);
        School school =schoolService.get(id);
        return Result.success(school);
    }

}
