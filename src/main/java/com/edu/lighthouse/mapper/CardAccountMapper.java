package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.CardAccount;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CardAccountMapper extends Mapper<CardAccount>, MySqlMapper<CardAccount> {
}