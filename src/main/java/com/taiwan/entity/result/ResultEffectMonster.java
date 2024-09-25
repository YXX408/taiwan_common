package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultEffectMonster {
    /**
     * 伤害类型  PHYSIC:1:物理 MAGIC:2:魔法
     */
    private Integer damageType;
    /**
     * 攻击附加效果  0:无  1:光  2:火  3:冰  4:暗
     */
    private Integer magicElementType;
    /**
     * 伤害百分比数值（例子） 1.单值 100 2.固定成长 100;50 3.每级固定值 1001,2001,3001
     */
    private String damageRate;
    /**
     * 浮空力(y)
     */
    private Integer floatingRate;
    /**
     * 击中屏震时间 （ms）
     */
    private Integer hitScreenShakeTime;
}
