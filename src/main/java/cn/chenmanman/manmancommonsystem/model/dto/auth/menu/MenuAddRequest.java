package cn.chenmanman.manmancommonsystem.model.dto.auth.menu;

import lombok.Data;

@Data
public class MenuAddRequest {
    private String name;

    private String perms;

    private String path;

    private String component;

    private Long parentId;
}
