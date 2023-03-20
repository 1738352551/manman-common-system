package cn.chenmanman.manmancommonsystem.exception;

import cn.chenmanman.manmancommonsystem.model.entity.common.BaseResponse;
import cn.chenmanman.manmancommonsystem.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理器
 *
 * */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessHandle(BusinessException businessException) {
        log.error("发现自定义业务异常: " , businessException);
        return ResultUtil.filed(businessException.getCode(), businessException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse<?> exceptionHandle(Exception exception) {
        log.error("发现未知异常: " , exception);
        return ResultUtil.filed(500, exception.getMessage());
    }
}
