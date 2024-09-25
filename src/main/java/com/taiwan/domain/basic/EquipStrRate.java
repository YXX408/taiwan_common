package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EquipStrRate {
    /**
     * 强化类型 强化：1 增幅：2
     */
    private Integer type;
    /**
     * 强化等级
     */
    private Integer strengthen;
    /**
     * 成功率
     */
    private Integer sucRate;
    /**
     * 失败降级  NONE:0:无 MINUSONE:1:减一 ZERO:2:归零 BROKEN:3:破碎 MINUSMORE:4:随机降2-3级
     */
    private Integer fail;
    /**
     * 修正1
     */
    private Integer fix1;
    /**
     * 修正1最大值
     */
    private Integer fix1Max;
    /**
     * 修正2
     */
    private Integer fix2;
    /**
     * 修正2最大值
     */
    private Integer fix2Max;
    /**
     * 修正3条件 白|蓝|紫|绿|粉|橙
     */
    private String fix3Condition;
    /**
     * 修正3
     */
    private Integer fix3;
    /**
     * 强化卷增加的次数
     */
    private Integer tickAddNum;

}