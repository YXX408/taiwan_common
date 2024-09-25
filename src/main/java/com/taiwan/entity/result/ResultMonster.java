package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultMonster {
    private Integer id;//编号
    private Integer type;//类型
    private String name;//名称
    private Integer level;//等级
    private float maxHp;//HP MAX
    private float maxMp;//MP MAX
    private float hpRecover;//HP回复
    private float mpRecover;//MP回复
    private float attack;//物理攻击
    private float magicAttack;//魔法攻击
    private float defence;//物理防御
    private float magicDefence;//魔法防御
    private float attackSpeed;//攻击速度(1000)
    private float spellSpeed;//施法速度
    private float moveSpeed;//移动速度(1000)
    private float ciriticalAttack;//物理暴击
    private float ciriticalMagicAttack;//魔法暴击
    private float dex;//命中
    private float dodge;//闪避
    private float frozen;//僵直
    private float hard;//硬直
    private float cdReduceRate;//冷却缩减
    private float exp;//经验
    private float baseAtk;//基础力量
    private float baseInt;//基础智力
    private float sta;//基础体力
    private float spr;//基础精神
    private float ignoreDefAttackAdd;//无视物理防御 攻击增加
    private float ignoreDefMagicAttackAdd;//无视魔法防御 攻击增加
    private Integer elements;
    /**
     * 普通攻击ID
     */
    private Integer attackSkillID;
    /**
     * 携带技能ID （1|2|3…，0表示没有技能，这里不包含普攻ID）
     */
    private String skillIDs;
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

    private ResultSkillMonster skillMonster;
}
