package com.edu.lighthouse.web;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.UserRegVo;
import com.edu.lighthouse.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author jinzc
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Validated
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        log.info("用户注册, user={}", user.toString());
        int row = userService.register(user);
        if (row <= 0) {
            return Result.fail();
        }
        log.info("注册成功");
        return Result.success();
    }

    @Validated
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        log.info("用户登录, user={}", user.toString());
        UserRegVo userRegVo = userService.login(user.getName(), user.getPass());
        if (Objects.isNull(userRegVo)) {
            return Result.noAuth("用户名或密码有误");
        }
        log.info("登录成功");
        return Result.success(userRegVo);
    }

}
