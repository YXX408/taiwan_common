package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class TitleBook {
    /**
     * 名称
     */
    private String nouse1;
    /**
     * 类别:1:普通成就:2:特殊成就
     */
    private Integer type;
    /**
     * 称号ID集合
     */
    private String items;
    /**
     * 装备属性ID
     */
    private Integer equipPropID;
    /**
     * 推荐等级
     */
    private Integer recommendLevel;

}