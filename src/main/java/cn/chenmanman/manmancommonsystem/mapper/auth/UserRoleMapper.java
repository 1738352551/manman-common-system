package cn.chenmanman.manmancommonsystem.mapper.auth;

import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper extends BaseMapper<ManManUserRole> {
}
