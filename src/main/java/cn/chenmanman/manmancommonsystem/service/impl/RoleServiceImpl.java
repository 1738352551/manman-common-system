package cn.chenmanman.manmancommonsystem.service.impl;

import cn.chenmanman.manmancommonsystem.mapper.auth.RoleMapper;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManRole;
import cn.chenmanman.manmancommonsystem.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, ManManRole> implements IRoleService {
}
