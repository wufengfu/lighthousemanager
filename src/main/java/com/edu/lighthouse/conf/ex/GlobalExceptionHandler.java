package com.edu.lighthouse.conf.ex;

import com.edu.lighthouse.conf.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.Optional;
import java.util.Set;

/**
 * 全局异常处理类
 * @author jinzc
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    public GlobalExceptionHandler() {}

    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public Result bizExceptionHandler(HttpServletRequest req, BizException e) {
        log.error("发生业务异常！详情:{} ", e.getErrorMsg());
        String code = Optional.ofNullable(e.getErrorCode())
                .orElse(HttpStatus.BAD_REQUEST.toString());
        Result result = Result.error(code, e.getErrorMsg());
        result.setExMsg(e.getLocalizedMessage());
        return result;
    }


    /**
     * 参数校验异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    @ResponseBody
    public Result servletRequestExceptionHandler(HttpServletRequest req, MissingServletRequestParameterException e) {
        log.error("请求参数缺失！ 请求地址:{}, 详情:{} ", req.getRequestURI(), e.getMessage());
        Result result = Result.badArg();
        result.setExMsg(e.getMessage());
        return result;
    }


    /**
     * 参数校验异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    public Result illegalArgExceptionHandler(HttpServletRequest req, IllegalArgumentException e) {
        log.error("参数异常! 请求地址:{}, 详情:{} ", req.getRequestURI(), e.getMessage());
        Result result = Result.badArg(e.getMessage());
        result.setExMsg(e.getMessage());
        return result;
    }

    /**
     * 状态校验异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = IllegalStateException.class)
    @ResponseBody
    public Result illegalStateExceptionHandler(HttpServletRequest req, IllegalStateException e) {
        log.error("状态异常! 请求地址:{}, 详情:{} ", req.getRequestURI(), e.getStackTrace());
        Result result = Result.badArg(e.getMessage());
        result.setExMsg(e.getMessage());
        return result;
    }


    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public Result nullExceptionHandler(HttpServletRequest req, NullPointerException e) {
        log.error("发生空指针异常！详情:{}", e);
        Result result = Result.error("NPE");
        result.setExMsg(e.getMessage());
        return result;
    }


    /**
     * 处理校验参数异常
     * @param exception
     * @return
     */
    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    public Result validationHandler(ValidationException exception) {
        if (exception instanceof ConstraintViolationException) {
            ConstraintViolationException exs = (ConstraintViolationException) exception;
            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            for (ConstraintViolation<?> item : violations) {
                return  Result.error(String.valueOf(HttpStatus.BAD_REQUEST.value()), item.getMessage());
            }
        }
        return Result.error(String.valueOf(HttpStatus.BAD_REQUEST.value()), exception.getMessage());
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("未知异常！详情: {}", e);
        Result result = Result.error("暂未获取数据,可能是由于网络异常导致的");
        result.setExMsg(e.getMessage());
        return result;
    }
}
