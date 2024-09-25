package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EquipEnhanceAttribute {
    /**
     * 稀有度
     */
    private Integer color;
    /**
     * 增幅等级
     */
    private Integer enhanceLevel;
    /**
     * 装备等级
     */
    private Integer level;
    /**
     * 增幅增加的属性值
     */
    private Integer enhanceAttribute;
    /**
     * 增幅增加的属性值PVP
     */
    private Integer enhanceAttributePVP;
    /**
     * 增幅附加评分
     */
    private Integer eqScore;

}