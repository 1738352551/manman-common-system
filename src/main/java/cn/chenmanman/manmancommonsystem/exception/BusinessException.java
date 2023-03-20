package cn.chenmanman.manmancommonsystem.exception;


import cn.chenmanman.manmancommonsystem.enums.ResponseCodeEnum;

/**
 * 自定义业务异常
 * */
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ResponseCodeEnum codeEnum) {
        super(codeEnum.getMsg());
        this.code = codeEnum.getCode();
    }

    public BusinessException(ResponseCodeEnum codeEnum, String message) {
        super(message);
        this.code = codeEnum.getCode();
    }

    public int getCode() {
        return code;
    }
}
