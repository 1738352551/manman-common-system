package cn.chenmanman.manmancommonsystem.model.entity.auth;

import cn.chenmanman.manmancommonsystem.model.entity.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("man_user")
public class ManManUser extends BaseEntity implements UserDetails {

    private static final long serialVersionUID = -5218639256191709554L;
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

    private Collection<SimpleGrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return this.status == 0;
    }
}
