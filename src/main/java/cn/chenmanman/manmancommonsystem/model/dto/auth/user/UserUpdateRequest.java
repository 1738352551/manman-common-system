package cn.chenmanman.manmancommonsystem.model.dto.auth.user;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private String username;

    private String password;

    private Integer gender;

    private String qq;

    private String email;

    private Integer status;
}
