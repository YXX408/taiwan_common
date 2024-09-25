package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ResultSkill {
    /**
     * 图标
     */
    private String icon;
    /**
     * 技能基本速度 （1000）
     */
    private Integer speed;
    /**
     * 技能受角色速度影响类型 0：没影响 1：攻速影响 2：释放速度影响
     */
    private Integer speedEffectType;
    /**
     * 是否为BUFF技能  0:不是 1:是
     */
    private Integer isBuff;
    /**
     * 消耗模式 0:hp,MP都消耗 1:只消耗MP 2:只消耗HP
     */
    private Integer costMode;
    /**
     * HP消耗百分比 （1000）
     */
    private Integer hPCostPercent;
    /**
     * HP消耗
     */
    private Float hPCost;
    /**
     * MP消耗
     */
    private Float mPCost;
    /**
     * 释放时间
     */
    private Integer spellTime;
    /**
     * 冷却时间
     */
    private String refreshTime;
    /**
     * 是否为普攻Combo技能 （仅职业普攻触发Combo使用）
     */
    private Integer isAttackCombo;
    /**
     * 最小冷却时间
     */
    private Integer minCD;
    /**
     * 技能属性  0:无 1:光 2:火 3:冰 4:暗 5:不受影响
     */
    private Integer skillAttri;
    /**
     * 技能属性  触发效果
     */
    private Map<Integer,ResultEffect> effects;
}
