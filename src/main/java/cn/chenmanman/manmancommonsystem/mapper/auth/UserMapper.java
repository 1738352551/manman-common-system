package cn.chenmanman.manmancommonsystem.mapper.auth;

import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManRole;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<ManManUser> {
    /**
     * 通过用户id查询用户权限
     * todo
     * */
    List<String> selectUserPermsById(Long id);

    /**
     * 通过用户名查询用户权限
     * todo
     * */
    List<String> selectUserPermsByUsername(String username);

    /**
     * 通过用户名查询用户角色
     * todo
     * */
    ManManRole selectUserRoleByUsername(String username);
}
