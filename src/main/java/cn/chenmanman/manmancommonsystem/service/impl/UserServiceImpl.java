package cn.chenmanman.manmancommonsystem.service.impl;

import cn.chenmanman.manmancommonsystem.enums.ResponseCodeEnum;
import cn.chenmanman.manmancommonsystem.exception.BusinessException;
import cn.chenmanman.manmancommonsystem.mapper.auth.UserMapper;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManUser;
import cn.chenmanman.manmancommonsystem.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, ManManUser> implements IUserService  {
    /**
     * 用户注册
     *
     * @param username 用户名
     * @param password 密码
     * @param gender   性别
     */
    @Override
    public long userRegister(String username, String password, Integer gender) {
        // 检查用户是否已经存在 start

        QueryWrapper<ManManUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", username);
        ManManUser manManUser = this.getBaseMapper().selectOne(queryWrapper);
        if (Objects.nonNull(manManUser)) {
            throw new BusinessException(ResponseCodeEnum.USER_EXISTS);
        }

        // 检查用户是否已经存在 end

        // 因为不存在所以添加
        ManManUser waitInsertUser = new ManManUser();
        waitInsertUser.setUserName(username);
        waitInsertUser.setPassword(password);
        waitInsertUser.setGender(gender);
        return this.getBaseMapper().insert(waitInsertUser);
    }
}
