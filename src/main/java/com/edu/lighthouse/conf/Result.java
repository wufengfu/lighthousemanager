package com.edu.lighthouse.conf;

import com.edu.lighthouse.conf.ex.BaseErrorInfoInterface;
import com.edu.lighthouse.conf.ex.ExEnum;
import org.apache.commons.lang3.StringUtils;


/**
 * 包装接口返回数据的实体
 * @author jinzc
 */
public class Result<T>{
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 错误详情
     */
    private String exMsg;

    /**
     * 响应结果
     */
    private T result;

    public Result() {
    }

    public Result(BaseErrorInfoInterface errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExMsg() {
        return exMsg;
    }
    public void setExMsg(String exMsg) {
        this.exMsg = exMsg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    /**
     * 成功
     *
     * @return
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result rb = new Result();
        rb.setCode(ExEnum.SUCCESS.getResultCode());
        rb.setMessage(ExEnum.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

    /**
     * 失败
     */
    public static Result error(BaseErrorInfoInterface errorInfo) {
        Result rb = new Result();
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static Result error(String code, String message) {
        Result rb = new Result();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static Result error( String message) {
        Result rb = new Result();
        rb.setCode(ExEnum.INTERNAL_SERVER_ERROR.getResultCode());
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }


    /**
     * 结果是否失败
     * @param result
     * @return
     */
    public static boolean isFail(Result result) {
        return !StringUtils.equals(result.getCode(), ExEnum.SUCCESS.getResultCode());
    }

    /**
     * 结果是否成功
     * @param result
     * @return
     */
    public static boolean isSuccess(Result result) {
        return !isFail(result);
    }

    /**
     * error: 数据库操作失败
     * @return
     */
    public static Result fail() {
        return Result.error(ExEnum.BIZ_DO_FAILURE.getResultCode(), ExEnum.BIZ_DO_FAILURE.getResultMsg());
    }

    /**
     * error: 参数非法或异常
     * @return
     */
    public static Result badArg() {
        return Result.error(ExEnum.PARAM_INVALID.getResultCode(), ExEnum.PARAM_INVALID.getResultMsg());
    }

    public static Result badArg(String message) {
        return Result.error(ExEnum.PARAM_INVALID.getResultCode(), message);
    }

    /**
     * error: 业务处理异常
     * @return
     */
    public static Result bizExp() {
        return Result.error(ExEnum.BIZ_CHECK_EXP.getResultCode(), ExEnum.BIZ_CHECK_EXP.getResultMsg());
    }
    public static Result bizExp(String message) {
        return Result.error(ExEnum.BIZ_CHECK_EXP.getResultCode(), message);
    }

    /**
     * error: 第三方调用异常
     */
    public static Result otherExp () {
        return Result.error(ExEnum.BIZ_OTHER_EXP.getResultCode(), ExEnum.BIZ_OTHER_EXP.getResultMsg());
    }
    public static Result otherExp (String message) {
        return Result.error(ExEnum.BIZ_OTHER_EXP.getResultCode(), message);
    }

    /**
     * error: 依赖服务调用异常
     */
    public static Result relyExp() {
        return Result.error(ExEnum.BIZ_FEIGN_EXP.getResultCode(), ExEnum.BIZ_FEIGN_EXP.getResultMsg());
    }
    /**
     * 无权操作
     * @return
     */
    public static Result noAuth(){
        return Result.error(ExEnum.BIZ_NO_AUTH.getResultCode(), ExEnum.BIZ_NO_AUTH.getResultMsg());
    }
    public static Result noAuth(String message){
        return Result.error(ExEnum.BIZ_NO_AUTH.getResultCode(), message);
    }

    /**
     * 返回消息，客户端继续
     * @return
     */
    public static Result cliContinue() {
        return Result.error(ExEnum.CLI_CONTINUE.getResultCode(), ExEnum.CLI_CONTINUE.getResultMsg());
    }
    public static Result cliContinue(String message) {
        return Result.error(ExEnum.CLI_CONTINUE.getResultCode(), message);
    }

}
