package cn.chenmanman.manmancommonsystem.service.impl;

import cn.chenmanman.manmancommonsystem.mapper.auth.MenuMapper;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManMenu;
import cn.chenmanman.manmancommonsystem.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, ManManMenu> implements IMenuService {
}
