package cn.chenmanman.manmancommonsystem.model.entity.common;

import cn.chenmanman.manmancommonsystem.enums.ResponseCodeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一响应体
 * */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = -6699833784871414310L;
    private String msg;

    private Integer code;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public BaseResponse(Integer code, T data){
        this.code = code;

        this.data = data;
    }

    public BaseResponse(ResponseCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }
}
