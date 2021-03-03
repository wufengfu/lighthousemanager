package com.edu.lighthouse.service;

import com.edu.lighthouse.conf.Result;
import com.edu.lighthouse.helper.OrgCodeGenerator;
import com.edu.lighthouse.helper.security.Encryption;
import com.edu.lighthouse.mapper.CardInfoMapper;
import com.edu.lighthouse.mapper.CardMainMapper;
import com.edu.lighthouse.mapper.MajorMapper;
import com.edu.lighthouse.pojo.CardInfo;
import com.edu.lighthouse.pojo.CardMain;
import com.edu.lighthouse.pojo.Major;
import com.edu.lighthouse.pojo.vo.*;
import com.edu.lighthouse.struct.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author wufengfu
 */
@Service
public class CardService {

    CardInfoMapper cardInfoMapper;

    @Autowired
    public CardService(CardInfoMapper cardInfoMapper) {
        this.cardInfoMapper = cardInfoMapper;
    }

    public List<CardInfo> listCard(CardBaseVo cardBaseVo) {

        return cardInfoMapper.cardList(cardBaseVo);
    }

    public CardMain addCard(CardInfoVo cardInfoVo){

        CardMain cardMain = Copy.struct(cardInfoVo,CardMain.class);
        //other operate
        String cardCode = OrgCodeGenerator.generateMemberCard();
        String cardPass = OrgCodeGenerator.generateDjq();
        cardMain.setCardCode(cardCode);
        cardMain.setCardPassword(Encryption.hash(cardPass));
        int row = cardInfoMapper.insertCard(cardMain);
        if (row <= 0) {
            return null;
        }
        return cardMain;
    }

}
