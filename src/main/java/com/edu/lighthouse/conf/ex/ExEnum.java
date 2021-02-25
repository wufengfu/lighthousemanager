package com.edu.lighthouse.conf.ex;

/**
 *  异常枚举类
 *  @author jinzc
 */
public enum ExEnum implements BaseErrorInfoInterface {
    /**
     * 成功
     */
    SUCCESS("200", "成功!"),
    /**
     * 参数非法
     */
    PARAM_INVALID("406", "参数非法"),

    /**
     * 业务校验时，与业务不符
     */
    BIZ_CHECK_EXP("511", "业务校验时，与业务不符"),
    /**
     * 获取对象或数据为空
     */
    BIZ_OBJECT_NULL("512", "获取对象或数据为空"),
    /**
     * 数据库操作失败
     */
    BIZ_DO_FAILURE("513", "数据库操作失败"),
    /**
     * 第三方业务异常
     */
    BIZ_OTHER_EXP("514", "第三方业务异常"),
    /**
     * 依赖服务调用异常
     */
    BIZ_FEIGN_EXP("515", "依赖服务调用异常"),
    /**
     * 无权操作
     */
    BIZ_NO_AUTH("516", "无权操作"),
    /**
     * 尝试次数过多
     */
    BIZ_TRY_MAX("517", "尝试次数过多"),

    /**
     * 请求的数据格式不符!
     */
    BODY_NOT_MATCH("400","请求的数据格式不符!"),

    /**
     * 请求的数字签名不匹配!
     */
    SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配!"),
    /**
     * 未找到该资源!
     */
    NOT_FOUND("404", "未找到该资源!"),
    /**
     * 服务器内部错误!
     */
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    /**
     * 服务器正忙，请稍后再试!
     */
    SERVER_BUSY("503","服务器正忙，请稍后再试!"),
    /**
     * 客户端继续发送请求
     */
    CLI_CONTINUE("100","客户端继续发送请求"),
    ;

    /**
     * 错误码
     */
    private String resultCode;
    /**
     * 错误信息
     */
    private String resultMsg;

    ExEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }

}
