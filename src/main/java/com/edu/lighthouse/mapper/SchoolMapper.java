package com.edu.lighthouse.mapper;

import com.edu.lighthouse.pojo.School;
import com.edu.lighthouse.pojo.vo.SchoolBaseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {

    /**
     * 院校地域列表
     *
     * @return 地域（省份）列表
     */
    List<String> listLocation();

    /**
     * 院校类型列表
     *
     * @return 综合、理工...
     */
    List<String> listType();

    /**
     * 院校性质列表
     *
     * @return 公办、民办...
     */
    List<String> listProperty();

    /**
     * 学校列表
     *
     * @param params 查询条件实体类
     * @return schoolVo 列表
     */
    List<SchoolBaseVo> list(SchoolBaseVo params);

    /**
     * 获取院校详情
     *
     * @param id 院校id
     * @return 院校实体所有字段
     */
    School get(int id);
}
