package com.edu.lighthouse.service;

import com.edu.lighthouse.mapper.CardChannelMapper;
import com.edu.lighthouse.mapper.RuleInfoMapper;
import com.edu.lighthouse.pojo.CardChannel;
import com.edu.lighthouse.pojo.RuleInfo;
import com.edu.lighthouse.pojo.vo.RuleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wufengfu
 */
@Service
public class ChannelService {

    final
    CardChannelMapper cardChannelMapper;

    public ChannelService(CardChannelMapper cardChannelMapper) {
        this.cardChannelMapper = cardChannelMapper;
    }

    public List<CardChannel> listChannel() {

        return cardChannelMapper.selectAll();
    }

}
