package cn.chenmanman.manmancommonsystem.model.entity.auth;

import cn.chenmanman.manmancommonsystem.model.entity.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@TableName("man_user")
public class ManManUser extends BaseEntity {

    /**
     * 账号
     * */
    private String userName;

    /**
     * 密码
     * */
    private String password;

    /**
     * 性别
     * */
    private Integer gender;

    /**
     * qq
     * */
    private String qq;

    /**
     * 邮箱
     * */
    private String email;

    /**
     * 用户状态
     * 正常:0 禁用:1
     * */
    private Integer status;
}
