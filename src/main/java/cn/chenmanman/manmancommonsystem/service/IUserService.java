package cn.chenmanman.manmancommonsystem.service;

import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManUser;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IUserService extends IService<ManManUser> {


    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @param gender 性别
     * */
    long userRegister(String username, String password, Integer gender);


}
