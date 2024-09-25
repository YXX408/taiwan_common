package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class MallType {
    /**
     * 主类别名称 （注：时装名称分为单品、套装）
     */
    private String mainTypeName;
    /**
     * 是否废弃  0：废弃 1：使用
     */
    private Integer use;

}