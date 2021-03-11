package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.CardInfo;
import com.edu.lighthouse.pojo.CardMain;
import com.edu.lighthouse.pojo.User;
import com.edu.lighthouse.pojo.vo.CardBaseVo;
import com.edu.lighthouse.pojo.vo.CardInfoVo;
import com.edu.lighthouse.pojo.vo.UserRegVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wufengfu
 */
@Mapper
public interface CardInfoMapper {

    /**
     * 获取符合条件的卡列表信息
     * @param cardBaseVo
     * @return
     */
    List<CardInfo> cardList(CardBaseVo cardBaseVo);

    /**
     * 插入卡片信息
     * @param cardMain 卡片信息
     * @return
     */
    int insertCard(CardMain cardMain);
    /**
     * 批量插入卡片信息
     * @param cardMainList 卡片信息
     * @return
     */
    int insertCardBatch(List<CardMain> cardMainList);
}
