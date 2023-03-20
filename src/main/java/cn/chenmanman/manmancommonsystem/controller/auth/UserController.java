package cn.chenmanman.manmancommonsystem.controller.auth;

import cn.chenmanman.manmancommonsystem.enums.ResponseCodeEnum;
import cn.chenmanman.manmancommonsystem.exception.BusinessException;
import cn.chenmanman.manmancommonsystem.model.dto.auth.user.UserAddRequest;
import cn.chenmanman.manmancommonsystem.model.dto.auth.user.UserUpdateRequest;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManUser;
import cn.chenmanman.manmancommonsystem.model.entity.common.BaseResponse;
import cn.chenmanman.manmancommonsystem.model.entity.common.PageRequest;
import cn.chenmanman.manmancommonsystem.service.IUserService;
import cn.chenmanman.manmancommonsystem.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * 用户api接口
 *
 * */
@RestController
@Api(value = "用户管理", tags = {"用户管理"})
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 分页查询
     * todo
     * */
    @ApiOperation("分页查询用户")
    @PostMapping("/all")
    public BaseResponse<?> queryUserList(PageRequest pageRequest) {

        return null;
    }

    @ApiOperation("获取所有用户")
    @GetMapping
    public BaseResponse<?> queryUserAll(){
        return ResultUtil.success(userService.list());
    }

    @ApiOperation("添加新用户")
    @PostMapping
    public BaseResponse<?> addUser(@RequestBody UserAddRequest userAddRequest) {
        if (Objects.isNull(userAddRequest)) {
            throw new BusinessException(ResponseCodeEnum.PARAMS_FAILED);
        }
        ManManUser manManUser = new ManManUser();
        BeanUtils.copyProperties(userAddRequest, manManUser);
        return ResultUtil.autoResponse( userService.save(manManUser));
    }

    @ApiOperation("更新用户信息")
    @PutMapping
    public BaseResponse<?> changeUser(@RequestBody UserUpdateRequest userUpdateRequest) {
        if (Objects.isNull(userUpdateRequest)) {
            throw new BusinessException(ResponseCodeEnum.PARAMS_FAILED);
        }
        ManManUser manManUser = new ManManUser();
        BeanUtils.copyProperties(userUpdateRequest, manManUser);
        return ResultUtil.autoResponse( userService.updateById(manManUser));
    }

    @ApiOperation("批量删除用户")
    @DeleteMapping
    public BaseResponse<?> removeUserByIds(List<Integer> ids) {
        if (Objects.isNull(ids) || ids.size()==0) {
            throw new BusinessException(ResponseCodeEnum.PARAMS_FAILED);
        }
        return ResultUtil.autoResponse( userService.removeBatchByIds(ids));
    }
}
