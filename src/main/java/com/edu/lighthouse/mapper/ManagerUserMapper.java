package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.ManagerUser;
import com.edu.lighthouse.pojo.vo.ManagerUserRegVo;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wufengfu
 */
@org.apache.ibatis.annotations.Mapper
public interface ManagerUserMapper extends Mapper<ManagerUser>, MySqlMapper<ManagerUser> {
    /**
     * 注册管理员账户
     * @param user
     * @return
     */
    int register(ManagerUser user);

    /**
     * 根据登陆名获取管理员对象信息
     * @param loginName
     * @return
     */
    ManagerUserRegVo selectByName(String loginName);
}