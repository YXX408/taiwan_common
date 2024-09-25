package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class FightPackage {
    /**
     * 名称
     */
    private String name;
    /**
     * 基础力量
     */
    private float power;
    /**
     * 基础智力
     */
    private float intellect;
    /**
     * 基础体力
     */
    private float streangth;
    /**
     * 基础精神
     */
    private float spirit;
    /**
     * 基础最大HP
     */
    private Integer hP;
    /**
     * 基础最大MP
     */
    private Integer mP;
    /**
     * 基础HP回复
     */
    private Integer hPRecover;
    /**
     * 基础MP回复
     */
    private Integer mPRecover;
    /**
     * 基础物理攻击
     */
    private Integer physicAttack;
    /**
     * 基础魔法攻击
     */
    private Integer magicAttack;
    /**
     * 基础物理防御
     */
    private Integer physicDefence;
    /**
     * 基础魔法防御
     */
    private Integer magicDefence;
    /**
     * 基础攻击速度(1000)
     */
    private Integer attackSpeed;
    /**
     * 基础施法速度
     */
    private Integer spellSpeed;
    /**
     * 基础移动速度(1000)
     */
    private Integer moveSpeed;
    /**
     * 基础物理暴击
     */
    private Integer physicalCritical;
    /**
     * 基础魔法暴击
     */
    private Integer magicCritical;
    /**
     * 基础命中
     */
    private Integer hitRate;
    /**
     * 基础闪避
     */
    private Integer missRate;
    /**
     * 基础僵直
     */
    private Integer starkValue;
    /**
     * 基础硬直
     */
    private Integer hardValue;
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
    /**
     * 异常抗性总
     */
    private Integer abormalResist;
    /**
     * 各种异常抗性
     */
    private String abormalResists;
    /**
     * 基础冷却缩减
     */
    private Integer cold;
    /**
     * 升级HP上限提升
     */
    private Integer hPLevel;
    /**
     * 升级MP上限提升
     */
    private Integer mPLevel;
    /**
     * 升级力量
     */
    private float powerLevel;
    /**
     * 升级智力
     */
    private float intellectLevel;
    /**
     * 升级体力
     */
    private float strengthLevel;
    /**
     * 升级精神
     */
    private float spiritLevel;
    /**
     * MP恢复提升
     */
    private Integer mPRecoverLevel;
    /**
     * 升级硬直恢复提升
     */
    private Integer hardValueLevel;
    /**
     * 升级转职时能力上升提升
     */
    private Integer transformAttirbuleAdd;

}