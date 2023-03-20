package cn.chenmanman.manmancommonsystem.controller.auth;

import cn.chenmanman.manmancommonsystem.enums.ResponseCodeEnum;
import cn.chenmanman.manmancommonsystem.exception.BusinessException;
import cn.chenmanman.manmancommonsystem.model.dto.auth.menu.MenuAddRequest;
import cn.chenmanman.manmancommonsystem.model.dto.auth.menu.MenuUpdateRequest;
import cn.chenmanman.manmancommonsystem.model.entity.auth.ManManMenu;
import cn.chenmanman.manmancommonsystem.model.entity.common.BaseResponse;
import cn.chenmanman.manmancommonsystem.model.entity.common.PageRequest;
import cn.chenmanman.manmancommonsystem.service.IMenuService;
import cn.chenmanman.manmancommonsystem.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * 菜单api接口
 *
 * */
@RestController
@Api(value = "菜单管理", tags = {"菜单管理"})
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService menuService;
    /**
     * 分页查询
     * todo
     * */
    @PostMapping("/all")
    public BaseResponse<?> queryUserList(PageRequest pageRequest) {

        return null;
    }

    @ApiOperation("查询所有菜单")
    @GetMapping
    public BaseResponse<?> queryMenuAll(){
        return ResultUtil.success(menuService.list());
    }

    @ApiOperation("添加新菜单")
    @PostMapping
    public BaseResponse<?> addMenu(@RequestBody MenuAddRequest menuAddRequest) {
        if (Objects.isNull(menuAddRequest)) {
            throw new BusinessException(ResponseCodeEnum.PARAMS_FAILED);
        }
        ManManMenu manManMenu = new ManManMenu();
        BeanUtils.copyProperties(menuAddRequest, manManMenu);
        return ResultUtil.autoResponse(menuService.save(manManMenu));
    }

    @ApiOperation("修改菜单信息")
    @PutMapping
    public BaseResponse<?> changeUser(@RequestBody MenuUpdateRequest menuUpdateRequest) {
        if (Objects.isNull(menuUpdateRequest)) {
            throw new BusinessException(ResponseCodeEnum.PARAMS_FAILED);
        }
        ManManMenu manManMenu = new ManManMenu();
        BeanUtils.copyProperties(menuUpdateRequest, manManMenu);
        return ResultUtil.autoResponse(menuService.updateById(manManMenu));
    }

    @ApiOperation("批量删除菜单")
    @DeleteMapping
    public BaseResponse<?> removeUserByIds(List<Long> ids) {
        if (Objects.isNull(ids) || ids.size()==0) {
            throw new BusinessException(ResponseCodeEnum.PARAMS_FAILED);
        }
        return ResultUtil.autoResponse(menuService.removeBatchByIds(ids));
    }
}
