package cn.chenmanman.manmancommonsystem.model.entity.auth;

import cn.chenmanman.manmancommonsystem.model.entity.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("man_menu")
public class ManManMenu extends BaseEntity {

    private static final long serialVersionUID = -8580559129196065902L;
    private String name;

    private Long parentId;

    private String perms;

    private String path;

    private String component;
}
