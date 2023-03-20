package cn.chenmanman.manmancommonsystem.model.entity.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 通用实体类
 *
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3084664877882624115L;
    /**
     * 主键id
     * */
    @TableId
    private Long id;


    /**
     * 创建时间
     * */
    private LocalDateTime createTime;

    /**
     * 创建人
     * */
    private Long createBy;


    /**
     * 更新时间
     * */
    private LocalDateTime updateTime;

    /**
     * 更新人
     * */
    private Long updateBy;

    /**
     * 备注
     * */
    private String remark;


    /**
     * 逻辑删除
     * 未删除:0   已删除:1
     * */
    @TableLogic
    private Integer delFlag;
}
