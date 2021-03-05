package com.edu.lighthouse.service;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.helper.security.Encryption;
import com.edu.lighthouse.helper.security.Jwt;
import com.edu.lighthouse.mapper.ManagerUserMapper;
import com.edu.lighthouse.mapper.UserMapper;
import com.edu.lighthouse.pojo.ManagerUser;
import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.ManagerUserRegVo;
import com.edu.lighthouse.pojo.vo.UserRegVo;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author wufengfu
 */
@Service
public class ManagerService {

    @Autowired
    ManagerUserMapper managerUserMapper;

    public Result register(ManagerUser managerUser) {

        if(managerUserMapper.selectByName(managerUser.getLoginName())!=null){
            return Result.error("已存在相同用户名，请重新注册！");
        }
        managerUser.setLoginPass(Encryption.hash(managerUser.getLoginPass()));
        int row = managerUserMapper.register(managerUser);
        if(row <= 0){
            return Result.error("注册失败，请重新尝试注册！");
        }
        return Result.success();
    }

    public ManagerUserRegVo login(String name, String pass) {
        ManagerUserRegVo userRegVo =  managerUserMapper.selectByName(name);
        if (Objects.isNull(userRegVo)) {
            return null;
        }
        boolean result = Encryption.checkPass(pass, userRegVo.getLoginPass());
        if (!result) {
            return null;
        }
        String token = Jwt.sign(userRegVo.getId().toString());
        userRegVo.setToken(token);
        userRegVo.setLoginPass(null);
        return userRegVo;
    }

    public ManagerUserRegVo info(String token) {
        if(StringUtils.isEmpty(token)){
            return null;
        }
        Claims claims = Jwt.unSign(token);
        Integer userId = Integer.valueOf(claims.get("userId").toString());
        ManagerUserRegVo userRegVo =  managerUserMapper.selectById(userId);
        return userRegVo;
    }
}
