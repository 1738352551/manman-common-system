package cn.chenmanman.manmancommonsystem.utils;

import cn.chenmanman.manmancommonsystem.enums.ResponseCodeEnum;
import cn.chenmanman.manmancommonsystem.model.entity.common.BaseResponse;

public class ResultUtil {
    // 成功

    /**
     * 成功直接响应数据
     * */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(ResponseCodeEnum.SUCCESS.getMsg(), ResponseCodeEnum.SUCCESS.getCode(), data);
    }

    /**
     * 成功响应数据并定制状态码，消息。
     *
     * */
    public static <T> BaseResponse<T> success(Integer code, String msg, T data) {
        return new BaseResponse<>(ResponseCodeEnum.SUCCESS.getMsg(), ResponseCodeEnum.SUCCESS.getCode(), data);
    }
    // 失败
    public static BaseResponse filed(ResponseCodeEnum codeEnum) {
        return new BaseResponse(codeEnum.getMsg(), codeEnum.getCode(), null);
    }

    public static BaseResponse filed(String msg) {
        return new BaseResponse(msg, ResponseCodeEnum.FAILED.getCode(), null);
    }
    public static BaseResponse filed(Integer code, String msg) {
        return new BaseResponse<>(ResponseCodeEnum.FAILED.getMsg(), ResponseCodeEnum.FAILED.getCode(), null);
    }

    // 自判

    public static BaseResponse autoResponse(boolean isSuccess) {
        return isSuccess ? ResultUtil.success(ResponseCodeEnum.SUCCESS) : ResultUtil.filed(ResponseCodeEnum.FAILED);
    }

}
