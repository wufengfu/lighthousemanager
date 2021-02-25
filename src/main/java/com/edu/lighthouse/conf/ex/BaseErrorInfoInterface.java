package com.edu.lighthouse.conf.ex;

/**
 * 全局异常处理，基础接口
 * @author jinzc
 */
public interface BaseErrorInfoInterface {
    /**
     * 获取错误码
     * @return 错误码
     */
    String getResultCode();

    /**
     * 获取错误信息
     * @return 错误文字提示
     */
    String getResultMsg();
}
