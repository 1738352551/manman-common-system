package cn.chenmanman.manmancommonsystem.controller.auth;

import cn.chenmanman.manmancommonsystem.model.entity.common.BaseResponse;
import cn.chenmanman.manmancommonsystem.model.entity.common.PageRequest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 角色api接口
 * todo
 * */
@RestController
@Api(value = "角色管理", tags = {"角色管理"})
@RequestMapping("/role")
public class RoleController {

    /**
     * 分页查询
     * todo
     * */
    @PostMapping("/all")
    public BaseResponse<?> queryUserList(PageRequest pageRequest) {

        return null;
    }

    @GetMapping
    public BaseResponse<?> queryUserAll(){
        return null;
    }

    @PostMapping
    public BaseResponse<?> addUser() {
        return null;
    }

    @PutMapping
    public BaseResponse<?> changeUser() {
        return null;
    }

    @DeleteMapping
    public BaseResponse<?> removeUserByIds() {
        return null;
    }
}
