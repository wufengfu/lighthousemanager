package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.CardMain;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wufengfu
 */
@org.apache.ibatis.annotations.Mapper
public interface CardMainMapper extends Mapper<CardMain>, MySqlMapper<CardMain> {
}