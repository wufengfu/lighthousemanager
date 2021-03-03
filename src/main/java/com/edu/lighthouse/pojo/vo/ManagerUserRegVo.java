package com.edu.lighthouse.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户 视图
 *
 * @author wufengfu
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManagerUserRegVo {
    private Integer id;

    private String loginName;

    private String loginPass;

    private Date createTime;

    private Byte delFlag;

    private String token;


}
