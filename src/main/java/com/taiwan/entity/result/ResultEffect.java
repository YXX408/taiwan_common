package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultEffect {
    /**
     * 伤害类型  PHYSIC:1:物理 MAGIC:2:魔法
     */
    private Integer damageType;
    /**
     * 暴击率 （增加这次攻击的暴击率1000，可成长）
     */
    private String attachCritical;
    /**
     * 攻击附加效果  0:无  1:光  2:火  3:冰  4:暗
     */
    private Integer magicElementType;
    /**
     * 装备属性攻击是否生效
     （不填默认0）
     0:否
     1:是
     */
    private Integer magicElementISuse;
    /**
     * 伤害百分比数值（例子） 1.单值 100 2.固定成长 100;50 3.每级固定值 1001,2001,3001
     */
    private Float damageRate;
    /**
     * 伤害固定数值
     */
    private String damageFixedValue;
    /**
     * 浮空力(y)
     */
    private String floatingRate;
    /**
     * 击中屏震时间 （ms）
     */
    private Integer hitScreenShakeTime;
    /**
     * BUFF ID  （只能填一个）
     */
    private Integer buffID;
    /**
     * BUFF 目标 SELF:0:自身 ENEMY:1:攻击对象
     */
    private Integer buffTarget;
    /**
     * BUFF 信息表 ID  （可以填多个）
     */
    private String buffInfoID;

    /**
     * 攻击推力(x) (1100等于1）
     */
    private String attack;
    /**
     * 僵直值
     */
    private String hardValue;
    /**
     * 触发的攻击特效
     */
    private String effectType;
}
