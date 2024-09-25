package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class MonsterAttribute {
    /**
     * 地下城难度 1 普通 2 冒险 3 勇士 4 王者 随从 1 侍从 2 骑士 3 贤者 4 传说
     */
    private Integer difficulty;
    /**
     * 怪物类型 1 普通 2 精英 3 boss 7 随从
     */
    private Integer monsterType;
    /**
     * 怪物模式类型 （随从填普通） 1 普通 2 深渊 3 远古 4 死亡之塔 5 召唤兽PVE 6 召唤兽PVP
     */
    private Integer monsterMode;
    /**
     * 等级
     */
    private Integer level;
    /**
     * HP MAX
     */
    private Integer maxHp;
    /**
     * MP MAX
     */
    private Integer maxMp;
    /**
     * HP回复
     */
    private Integer hpRecover;
    /**
     * MP回复
     */
    private Integer mpRecover;
    /**
     * 物理攻击
     */
    private Integer attack;
    /**
     * 魔法攻击
     */
    private Integer magicAttack;
    /**
     * 物理防御
     */
    private Integer defence;
    /**
     * 魔法防御
     */
    private Integer magicDefence;
    /**
     * 攻击速度(1000)
     */
    private Integer attackSpeed;
    /**
     * 施法速度
     */
    private float spellSpeed;
    /**
     * 移动速度(1000)
     */
    private Integer moveSpeed;
    /**
     * 物理暴击
     */
    private Integer ciriticalAttack;
    /**
     * 魔法暴击
     */
    private Integer ciriticalMagicAttack;
    /**
     * 命中
     */
    private float dex;
    /**
     * 闪避
     */
    private float dodge;
    /**
     * 僵直
     */
    private Integer frozen;
    /**
     * 硬直
     */
    private Integer hard;
    /**
     * 冷却缩减
     */
    private Integer cdReduceRate;
    /**
     * 经验
     */
    private Integer exp;
    /**
     * 基础力量
     */
    private Integer baseAtk;
    /**
     * 基础智力
     */
    private Integer baseInt;
    /**
     * 基础体力
     */
    private Integer sta;
    /**
     * 基础精神
     */
    private Integer spr;
    /**
     * 无视物理防御 攻击增加
     */
    private Integer ignoreDefAttackAdd;
    /**
     * 无视魔法防御 攻击增加
     */
    private Integer ignoreDefMagicAttackAdd;

}