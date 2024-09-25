package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class RoleAttr {
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
    private float hP;
    /**
     * 基础最大MP
     */
    private float mP;
    /**
     * 基础HP回复
     */
    private float hPRecover;
    /**
     * 基础MP回复
     */
    private float mPRecover;
    /**
     * 基础物理攻击
     */
    private float physicAttack;
    /**
     * 基础魔法攻击
     */
    private float magicAttack;
    /**
     * 基础物理防御
     */
    private float physicDefence;
    /**
     * 基础魔法防御
     */
    private float magicDefence;
    /**
     * 基础攻击速度(1000)
     */
    private float attackSpeed;
    /**
     * 基础施法速度
     */
    private float spellSpeed;
    /**
     * 基础移动速度(1000)
     */
    private float moveSpeed;
    /**
     * 基础物理暴击
     */
    private float physicalCritical;
    /**
     * 基础魔法暴击
     */
    private float magicCritical;
    /**
     * 基础命中
     */
    private float hitRate;
    /**
     * 基础闪避
     */
    private float missRate;
    /**
     * 基础僵直
     */
    private float starkValue;
    /**
     * 基础硬直
     */
    private float hardValue;
    /**
     * 光属强
     */
    private float lightAttack;
    /**
     * 火属强
     */
    private float fireAttack;
    /**
     * 冰属强
     */
    private float iceAttack;
    /**
     * 暗属强
     */
    private float darkAttack;
    /**
     * 光属抗
     */
    private float lightDefence;
    /**
     * 火属抗
     */
    private float fireDefence;
    /**
     * 冰属抗
     */
    private float iceDefence;
    /**
     * 暗属抗
     */
    private float darkDefence;
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
    private float cold;
    /**
     * 升级HP上限提升
     */
    private float hPLevel;
    /**
     * 升级MP上限提升
     */
    private float mPLevel;
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
    private float mPRecoverLevel;
    /**
     * 升级硬直恢复提升
     */
    private float hardValueLevel;
    /**
     * 升级转职时能力上升提升
     */
    private float transformAttirbuleAdd;

}