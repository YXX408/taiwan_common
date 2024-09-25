package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EqSuitScore {
    /**
     * 套装类型 1：装备 2：时装
     */
    private Integer type;
    /**
     * 套装数量
     */
    private Integer suitNum;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 套装评分
     */
    private Integer equipsAttrID;

}