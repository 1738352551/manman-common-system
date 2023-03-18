package cn.chenmanman.manmancommonsystem.mapper.auth;

import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper extends BaseMapper<ManManMenu> {
}
