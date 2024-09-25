package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultEqInfo {
    private Integer enhLv;
    /**
     * 物理攻击
     */
    private Integer atk;
    /**
     * 法术攻击
     */
    private Integer magicAtk;
    /**
     * 物理防御
     */
    private Integer def;
    /**
     * 法术防御
     */
    private Integer magicDef;
    /**
     * 力量 (有浮点参与属性计算)
     */
    private Integer strenth;
    /**
     * 智力 (有浮点参与属性计算)
     */
    private Integer intellect;
    /**
     * 精神 (有浮点参与属性计算)
     */
    private Integer spirit;
    /**
     * 体力 (有浮点参与属性计算)
     */
    private Integer stamina;
    /**
     * HP最大值
     */
    private Integer hPMax;
    /**
     * MP最大值
     */
    private Integer mPMax;
    /**
     * HP恢复
     */
    private Integer hPRecover;
    /**
     * MP恢复
     */
    private Integer mPRecover;
    /**
     * 攻击速度 (千分比)
     */
    private Integer attackSpeedRate;
    /**
     * 施放速度 (千分比)
     */
    private Integer fireSpeedRate;
    /**
     * 移动速度 (千分比)
     */
    private Integer moveSpeedRate;
    /**
     * 命中率 (千分比)
     */
    private Integer hitRate;
    /**
     * 回避率 (千分比)
     */
    private Integer avoidRate;
    /**
     * 物理暴击 (千分比)
     */
    private Integer physicCrit;
    /**
     * 魔法暴击 (千分比)
     */
    private Integer magicCrit;
    /**
     * 硬直
     */
    private Integer spasticity;
    /**
     * 光属强
     */
    private Integer lightAttack;
    /**
     * 火属强
     */
    private Integer fireAttack;
    /**
     * 冰属强
     */
    private Integer iceAttack;
    /**
     * 暗属强
     */
    private Integer darkAttack;
    /**
     * 光属抗
     */
    private Integer lightDefence;
    /**
     * 火属抗
     */
    private Integer fireDefence;
    /**
     * 冰属抗
     */
    private Integer iceDefence;
    /**
     * 暗属抗
     */
    private Integer darkDefence;
}
