package cn.chenmanman.manmancommonsystem.service.impl;

import cn.chenmanman.manmancommonsystem.mapper.auth.UserMapper;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManUser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 实现SpringSecurity的接口
 * @author 陈慢慢
 * */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<ManManUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", username);
        ManManUser manManUser = userMapper.selectOne(queryWrapper);
        if (Objects.isNull(manManUser)) {
            throw new UsernameNotFoundException("用户名未找到!");
        }

        // todo 封装个UserDetails对象，然后返回。

        return null;
    }
}
