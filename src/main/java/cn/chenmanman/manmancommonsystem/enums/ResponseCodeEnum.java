package cn.chenmanman.manmancommonsystem.enums;

/**
 * 响应码枚举类
 *
 * */


public enum ResponseCodeEnum {
    // 通用状态码
    SUCCESS(200, "请求成功!"),
    FAILED(500, "请求失败!"),
    PARAMS_FAILED(501, "参数异常!"),

    // 用户相关
    USER_EXISTS(520, "用户已存在!"),
    USER_ADD_FAILED(521, "用户添加失败!");

    private final Integer code;

    private final String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
