package com.edu.lighthouse.service;

import com.edu.lighthouse.mapper.CardInfoMapper;
import com.edu.lighthouse.mapper.CardMainMapper;
import com.edu.lighthouse.mapper.MajorMapper;
import com.edu.lighthouse.pojo.CardInfo;
import com.edu.lighthouse.pojo.CardMain;
import com.edu.lighthouse.pojo.Major;
import com.edu.lighthouse.pojo.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CardService {
    @Autowired
    CardInfoMapper cardInfoMapper;

    public List<CardInfo> listCard(CardBaseVo cardBaseVo) {

        return cardInfoMapper.cardList(cardBaseVo);
    }

}
