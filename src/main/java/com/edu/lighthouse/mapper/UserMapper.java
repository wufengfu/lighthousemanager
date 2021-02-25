package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.UserRegVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据库mapper
 *
 * @author jinzc
 */
@Mapper
public interface UserMapper {

    /**
     * 注册
     *
     * @param user 用户实体
     * @return 操作行数
     */
    Integer register(User user);

    /**
     * 按name查询
     *
     * @param name 账户名
     * @return UserVo 用户类视图
     */
    UserRegVo selectByName(String name);
}
