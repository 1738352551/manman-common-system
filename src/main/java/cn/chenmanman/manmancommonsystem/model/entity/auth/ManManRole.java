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
@TableName("man_role")
public class ManManRole extends BaseEntity {

    private static final long serialVersionUID = -9209376461031103554L;
    private String name;
}
