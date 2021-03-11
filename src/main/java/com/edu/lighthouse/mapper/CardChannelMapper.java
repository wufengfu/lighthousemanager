package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.CardChannel;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@org.apache.ibatis.annotations.Mapper
public interface CardChannelMapper extends Mapper<CardChannel>, MySqlMapper<CardChannel> {
}