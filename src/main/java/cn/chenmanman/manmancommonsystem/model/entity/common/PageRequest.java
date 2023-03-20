package cn.chenmanman.manmancommonsystem.model.entity.common;

import lombok.Data;

/**
 * 分页请求实体
 * */
@Data
public class PageRequest {
    /**
     * 当前页码
     * */
    private Integer pageNum;

    /**
     * 每页数量
     * */
    private Integer pageSize;
}
