package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.ManagerUser;
import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.ManagerUserRegVo;
import com.edu.lighthouse.pojo.vo.UserRegVo;
import com.edu.lighthouse.service.ManagerService;
import com.edu.lighthouse.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author jinzc
 */
@RestController
@RequestMapping("/api/v1/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    private Logger log = LoggerFactory.getLogger(ManagerController.class);

    @Validated
    @PostMapping("/register")
    public Result register(@RequestBody ManagerUser user) {
        log.info("用户注册, managerUser={}", user.toString());
        int row = managerService.register(user);
        if (row <= 0) {
            return Result.fail();
        }
        log.info("注册成功");
        return Result.success();
    }

    @Validated
    @PostMapping("/login")
    public Result login(@RequestBody ManagerUser user) {
        log.info("用户登录, user={}", user.toString());
        ManagerUserRegVo userRegVo = managerService.login(user.getLoginName(), user.getLoginPass());
        if (Objects.isNull(userRegVo)) {
            return Result.noAuth("用户名或密码有误");
        }
        log.info("登录成功");
        return Result.success(userRegVo);
    }

}
