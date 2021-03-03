package com.edu.lighthouse.service;

import com.edu.lighthouse.helper.security.Encryption;
import com.edu.lighthouse.helper.security.Jwt;
import com.edu.lighthouse.mapper.ManagerUserMapper;
import com.edu.lighthouse.mapper.UserMapper;
import com.edu.lighthouse.pojo.ManagerUser;
import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.ManagerUserRegVo;
import com.edu.lighthouse.pojo.vo.UserRegVo;
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

    public Integer register(ManagerUser managerUser) {
        managerUser.setLoginPass(Encryption.hash(managerUser.getLoginPass()));
        int row = managerUserMapper.register(managerUser);
        return row;
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
}
