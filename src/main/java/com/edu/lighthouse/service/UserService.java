package com.edu.lighthouse.service;

import com.edu.lighthouse.helper.security.Encryption;
import com.edu.lighthouse.helper.security.Jwt;
import com.edu.lighthouse.mapper.UserMapper;
import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.UserRegVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 用户类逻辑处理
 *
 * @author jinzc
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Integer register(User user) {
        user.setPass(Encryption.hash(user.getPass()));
        int row = userMapper.register(user);
        return row;
    }

    public UserRegVo login(String name, String pass) {
        UserRegVo userRegVo = userMapper.selectByName(name);
        if (Objects.isNull(userRegVo)) {
            return null;
        }
        boolean result = Encryption.checkPass(pass, userRegVo.getPass());
        if (!result) {
            return null;
        }
        String token = Jwt.sign(userRegVo.getId().toString());
        userRegVo.setToken(token);
        userRegVo.setPass(null);
        return userRegVo;
    }
}
