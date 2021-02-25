package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.Major;
import com.edu.lighthouse.pojo.vo.MajorCountVo;
import com.edu.lighthouse.pojo.vo.MajorLargeVo;
import com.edu.lighthouse.pojo.vo.MajorParentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jinzc
 */
@Mapper
public interface MajorMapper {

    /**
     * 查询大类及孙子专业数量
     *
     * @param undergraduate 枚举：专科或本科
     * @return 大类列表：id，name，countChild
     */
    List<MajorCountVo> listLargeCount(String undergraduate);

    /**
     * 查询所有大类
     *
     * @param undergraduate 枚举：专科或本科
     * @return 大类视图: 大类名称、所包含次大类串（逗号分割）
     */
    List<MajorLargeVo> listLarge(String undergraduate);

    /**
     * 查询所有次大类
     *
     * @param undergraduate 枚举：专科或本科
     * @param majorName 专业名称
     * @return 次大类视图：次大类名称、所包含孙子专业类串（id|name, id|name...）
     */
    List<MajorParentVo> listParent(String undergraduate, String majorName);

    /**
     * 查询专业详情
     *
     * @param code 专业代码
     * @return 专业信息实体
     */
    Major get(String code);
}
