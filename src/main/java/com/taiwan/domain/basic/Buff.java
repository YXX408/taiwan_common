package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Buff {
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 图标排列顺序-1表示不显示数字越小优先级越高疲劳燃烧BUFF为第一优先级(1~1000)活动奖励BUFF为第二优先级(1001~2000)技能BUFF为第三优先级(2001~3000)药水BUFF为第四优先级(3001~4000)
     */
    private Integer iconSortOrder;
    /**
     * 图标
     */
    private String icon;
    /**
     * buff类型-8:修改所有技能的属性-7:释放指定机制-6:释放技能-5:触发别的BUFF-4:buff驱散-3:召唤-2:SKILL_BUFF-1:属性增减（生命,魔力)0:属性修改
     */
    private Integer type;
    /**
     * 施法者死亡以后是否删除
     */
    private Integer isDelete;
    /**
     * 作用类型0:表示减益1:表示增益2:技能实现buff
     */
    private Integer workType;
    /**
     * 是否可被驱散0：不可以1：可以
     */
    private Integer dispelType;
    /**
     * 是否支持快速点击缩短时间0：不可以1：可以
     */
    private Integer isQuickPressSupport;
    /**
     * Buff特效类型选择霸体
     */
    private String effectShaderName;
    /**
     * 添加后显示的名字（如果要显示的话）
     */
    private String headName;
    /**
     * 在血条上显示效果名称
     */
    private String hpBarName;
    /**
     * buff过程是否显示头顶进度条
     */
    private Integer isShowSpell;
    /**
     * 低配下是否显示特效（填0或不填为不显示，填1为显示）
     */
    private Integer isLowLevelShow;
    /**
     * 出生特效名称
     */
    private String birthEffect;
    /**
     * 出生特效挂点
     */
    private String birthEffectLocate;
    /**
     * 特效名称
     */
    private String effectName;
    /**
     * 特效挂点
     */
    private String effectLocateName;
    /**
     * 特效是否循环0：循环1：不循环
     */
    private Integer effectLoop;
    /**
     * 结束特效名称
     */
    private String endEffect;
    /**
     * 结束特效挂点
     */
    private String endEffectLocate;
    /**
     * buff配置文件路径
     */
    private String effectConfigPath;
    /**
     * 伤害特效
     */
    private String hurtEffectName;
    /**
     * 伤害特效挂点
     */
    private String hurtEffectLocateName;
    /**
     * 播放音效(音效表ID)
     */
    private Integer sfxID;
    /**
     * buff控制逻辑路径
     */
    private String buffAIPath;
    /**
     * buff对象的初始动作，结束后会切回idle（此条禁用，容易导致BUG）（|后面的数字0代表不强转idle，1表示强转idle，如果不填默认为不强转）
     */
    private String targetState;
    /**
     * buff覆盖类型0:互不影响1:伤害覆盖2:时间覆盖3:不能覆盖4:时间叠加5:独立覆盖6:先进先出7:删除原来的添加新的8:刷新原来相同Id的buff时间,同时添加新的
     */
    private Integer overlay;
    /**
     * buff叠加上限（0表示没有上限）
     */
    private Integer overlayLimit;
    /**
     * 特效是否唯一1:是0:否
     */
    private Integer effectDisOverlay;
    /**
     * 触发间隔1000
     */
    private Integer triggerInterval;
    /**
     * 状态修改
     */
    private Integer stateChange;
    /**
     * 能力修改
     */
    private String abilityChange;
    /**
     * 附魔元素0:无1:光2:火3:冰4:暗
     */
    private String elements;
    /**
     * 光属强
     */
    private String lightAttack;
    /**
     * 火属强
     */
    private String fireAttack;
    /**
     * 冰属强
     */
    private String iceAttack;
    /**
     * 暗属强
     */
    private String darkAttack;
    /**
     * 光属抗
     */
    private String lightDefence;
    /**
     * 火属抗
     */
    private String fireDefence;
    /**
     * 冰属抗
     */
    private String iceDefence;
    /**
     * 暗属抗
     */
    private String darkDefence;
    /**
     * 使用技能ID（可以填多个）
     */
    private Integer useSkillIDs;
    /**
     * 驱散buff类型0:减益1:增益
     */
    private Integer dispelBuffType;
    /**
     * 触发buff信息表ID（可以填多个）
     */
    private String triggerBuffInfoIDs;
    /**
     * Buff结束时移除BuffInfo的Trigger0：默认不移除1：移除
     */
    private Integer exitRemoveTrigger;
    /**
     * 触发机制表ID（可以填多个）
     */
    private String mechanismID;
    /**
     * 回生命
     */
    private String hp;
    /**
     * 回魔力
     */
    private String mp;
    /**
     * 回生命%
     */
    private String hpRate;
    /**
     * 回魔力%
     */
    private Integer mpRate;
    /**
     * 回当前生命%
     */
    private Integer currentHpRate;
    /**
     * 是否限制扣除当前生命%最大值0：关1：开2：限制只在公会副本生效
     */
    private Integer currentHpRateControl;
    /**
     * 基础力量
     */
    private String baseAtk;
    /**
     * 基础智力
     */
    private String baseInt;
    /**
     * 基础体力
     */
    private String sta;
    /**
     * 基础精神
     */
    private String spr;
    /**
     * 基础独立攻击力
     */
    private String baseIndependent;
    /**
     * 基础力量增加百分比（1000）
     */
    private String atkAddRate;
    /**
     * 基础智力增加百分比（1000）
     */
    private String intAddRate;
    /**
     * 基础体力增加百分比（1000）
     */
    private Integer staAddRate;
    /**
     * 基础精神增加百分比（1000）
     */
    private Integer sprAddRate;
    /**
     * 基础独立攻击力增加百分比（1000）
     */
    private Integer independentAddRate;
    /**
     * 生命最大附加
     */
    private String maxHp;
    /**
     * 附加魔力最大
     */
    private String maxMp;
    /**
     * 生命最大增加百分比（1000）
     */
    private String maxHpAddRate;
    /**
     * 魔力最大增加百分比（1000）
     */
    private String maxMpAddRate;
    /**
     * 生命回复
     */
    private String hpRecover;
    /**
     * 魔力回复
     */
    private String mpRecover;
    /**
     * 基础物理攻击
     */
    private String attack;
    /**
     * 基础魔法攻击
     */
    private String magicAttack;
    /**
     * 基础物理防御
     */
    private String defence;
    /**
     * 基础魔法防御
     */
    private String magicDefence;
    /**
     * 基础攻击速度(1000)
     */
    private String attackSpeed;
    /**
     * 基础施法速度(1000)
     */
    private String spellSpeed;
    /**
     * 基础移动速度(1000)
     */
    private String moveSpeed;
    /**
     * 基础物理暴击
     */
    private String ciriticalAttack;
    /**
     * 基础魔法暴击
     */
    private String ciriticalMagicAttack;
    /**
     * 基础命中
     */
    private String dex;
    /**
     * 基础闪避
     */
    private String dodge;
    /**
     * 基础僵直
     */
    private Integer frozen;
    /**
     * 基础硬直
     */
    private String hard;
    /**
     * 异常抗性全部
     */
    private String abnormalResist;
    /**
     * 感电抗性
     */
    private Integer abnormalResist1;
    /**
     * 出血抗性
     */
    private Integer abnormalResist2;
    /**
     * 灼烧抗性
     */
    private Integer abnormalResist3;
    /**
     * 中毒抗性
     */
    private Integer abnormalResist4;
    /**
     * 失明抗性
     */
    private Integer abnormalResist5;
    /**
     * 眩晕抗性
     */
    private Integer abnormalResist6;
    /**
     * 石化抗性
     */
    private Integer abnormalResist7;
    /**
     * 冰冻抗性
     */
    private Integer abnormalResist8;
    /**
     * 睡眠抗性
     */
    private Integer abnormalResist9;
    /**
     * 混乱抗性
     */
    private Integer abnormalResist10;
    /**
     * 束缚抗性
     */
    private Integer abnormalResist11;
    /**
     * 减速抗性
     */
    private Integer abnormalResist12;
    /**
     * 诅咒抗性
     */
    private Integer abnormalResist13;
    /**
     * 暴击伤害百分比
     */
    private String criticalPercent;
    /**
     * 冷却缩减百分比（1000)
     */
    private Integer cdReduceRate;
    /**
     * 物理攻击增加百分比(1000)
     */
    private String attackAddRate;
    /**
     * 魔法攻击增加百分比(1000)
     */
    private String magicAttackAddRate;
    /**
     * 物理防御增加百分比（1000）
     */
    private String defenceAddRate;
    /**
     * 魔法防御增加百分比（1000）
     */
    private String magicDefenceAddRate;
    /**
     * 无视物理防御百分比(1000)
     */
    private Integer ingnoreDefRate;
    /**
     * 无视魔法防御百分比(1000)
     */
    private Integer ingnoreMagicDefRate;
    /**
     * 无视防御物理攻击增加百分比（1000）
     */
    private Integer ignoreDefAttackAddRate;
    /**
     * 无视防御魔法攻击增加百分比（1000）
     */
    private Integer ignoreDefMagicAttackAddRate;
    /**
     * 附加伤害固定值
     */
    private Integer attachAddDamageFix;
    /**
     * 附加伤害百分比(1000)
     */
    private String attachAddDamagePercent;
    /**
     * 增加伤害固定值
     */
    private Integer addDamageFix;
    /**
     * 增加伤害百分比(1000)
     */
    private String addDamagePercent;
    /**
     * 最终伤害百分比
     */
    private Integer finalDamagePercent;
    /**
     * 技能增加物理伤害百分比(1000)
     */
    private String skilladdDamagePercent;
    /**
     * 技能增加魔法伤害百分比(1000)
     */
    private String skilladdMagicDamagePercent;
    /**
     * 减伤固定值
     */
    private Integer reduceDamageFix;
    /**
     * 减伤固定值类型0:不指定类型1：物理伤害2：魔法伤害3：近身伤害4：远程伤害
     */
    private Integer reduceDamageFixType;
    /**
     * 减伤百分比（1000)
     */
    private String reduceDamagePercent;
    /**
     * 减伤百分比类型0:不指定类型1：物理伤害2：魔法伤害3：近身伤害4：远程伤害
     */
    private Integer reduceDamagePercentType;
    /**
     * 额外减伤百分比(1000)
     */
    private Integer extrareduceDamgePercent;
    /**
     * 额外减伤百分比类型0:不指定类型1：物理伤害2：魔法伤害3：近身伤害4：远程伤害
     */
    private Integer extrareduceDamagePercentType;
    /**
     * 反伤固定值
     */
    private Integer reflectDamageFix;
    /**
     * 反伤固定值类型0:不指定类型1：物理伤害2：魔法伤害3：近身伤害4：远程伤害
     */
    private Integer reflectDamageFixType;
    /**
     * 反伤百分比（1000）
     */
    private Integer reflectDamagePercent;
    /**
     * 反伤百分比类型0:不指定类型1：物理伤害2：魔法伤害3：近身伤害4：远程伤害
     */
    private Integer reflectDamagePercentType;
    /**
     * 技能等级
     */
    private Integer level;
    /**
     * 技能魔力消耗缩减百分比（1000）
     */
    private String skill_mpCostReduceRate;
    /**
     * 技能冷却缩减百分比（1000）
     */
    private String skill_cdReduceRate;
    /**
     * 技能冷却缩减固定值（1000/s）
     */
    private Integer skill_cdReduceValue;
    /**
     * 技能攻击速度增加百分比（1000）
     */
    private String skill_speedAddFactor;
    /**
     * 技能命中率提升百分比（1000）
     */
    private String skill_hitRateAdd;
    /**
     * 技能暴击率提升百分比（1000）
     */
    private Integer skill_criticalHitRateAdd;
    /**
     * 技能攻击力提升百分比（1000）
     */
    private String skill_attackAddRate;
    /**
     * 技能伤害百分比增加值(100)
     */
    private String skill_attackAdd;
    /**
     * 技能伤害固定值增加值
     */
    private Integer skill_attackAddFix;
    /**
     * 僵直提升百分比（1000）
     */
    private Integer skill_hardAddRate;
    /**
     * 技能蓄力缩减百分比（1000）
     */
    private String skill_chargeReduceRate;
    /**
     * 抗魔值
     */
    private Integer resistMagic;
    /**
     * AI好战性
     */
    private String ai_warlike;
    /**
     * AI视野
     */
    private String ai_sight;
    /**
     * AI攻击机率（例子:1表示1%）
     */
    private String ai_attackProb;
    /**
     * 召唤怪物ID
     */
    private Integer summon_monsterID;
    /**
     * 召唤怪物等级
     */
    private String summon_monsterLevel;
    /**
     * 存在时间（0表示没有存在时间，1000表示1秒）
     */
    private Integer summon_existTime;
    /**
     * 召唤位置类型FACE:0:面前一个单位ORIGIN:1:原地FACE_FORCE:2:面前一个单位不管阻挡FACE_BLACK:3:面前没有遮挡的位置
     */
    private Integer summon_posType;
    /**
     * 召唤位置类型2是否考虑阻挡|召唤位置类型距离1：考虑阻挡2：不考虑阻挡
     */
    private String summon_posType2;
    /**
     * 召唤表现0:无1:法阵
     */
    private Integer summon_display;
    /**
     * 召唤数量
     */
    private Integer summon_num;
    /**
     * 召唤物在召唤主死亡的时候是否死亡0：否1：是
     */
    private Integer summon_relation;
    /**
     * 此类召唤数量限制
     */
    private Integer summon_numLimit;
    /**
     * 召唤实体
     */
    private Integer summon_entity;
    /**
     * 分身属性数值（千分比，一样请填1000）
     */
    private Integer duplicate_percent;
    /**
     * 最大分身数量（0表示没有限制）
     */
    private Integer duplicate_max;
    /**
     * 经验加成百分比
     */
    private Integer expAddRate;
    /**
     * 金币加成百分比
     */
    private Integer goldAddRate;
    /**
     * 任务掉落数量加成百分比
     */
    private Integer taskDropAddRate;
    /**
     * 神器掉落加成百分比
     */
    private Integer pinkDropAddRate;
    /**
     * 翻牌掉落加成百分比
     */
    private Integer chestDropAddRate;
    /**
     * 持续时长类型0:持续一段时间时间1:持续一次地下城2:只在地下城生效3:持续一段时间(通过截止时间计算)
     */
    private Integer durationType;
    /**
     * 持续时长（s）
     */
    private Integer duration;
    /**
     * ValueA描述
     */
    private String descriptionA;
    /**
     * ValueA值
     */
    private String valueA;
    /**
     * ValueB描述
     */
    private String descriptionB;
    /**
     * ValueB值
     */
    private String valueB;
    /**
     * ValueC描述
     */
    private String descriptionC;
    /**
     * ValueC值
     */
    private String valueC;
    /**
     * ValueD描述
     */
    private String descriptionD;
    /**
     * ValueD值
     */
    private String valueD;
    /**
     * ValueE描述
     */
    private String descriptionE;
    /**
     * ValueE值
     */
    private String valueE;
    /**
     * ValueF描述
     */
    private String descriptionF;
    /**
     * ValueF值
     */
    private String valueF;
    /**
     * ValueG描述
     */
    private String descriptionG;
    /**
     * ValueG值
     */
    private String valueG;
    /**
     * 生效次数(默认无限次)
     */
    private Integer effectTimes;
    /**
     * 适用地下城(填子类型,以|分隔,默认全部适用)
     */
    private String applyDungeon;
    /**
     * BUFF类型（可多填,类型不可重复）HP_MAX:0:最大生命MP_MAX:1:最大魔力BASE_ATK:2:力量BASE_INT:3:智力STA:4:体力SPR:5:精神ATTACK:6:物理攻击力MAGIC_ATTACK:7:魔法攻击力DEFENCE:8:物理防御MAGIC_DEFENCE:9:魔法防御CIRITICAL_ATTACK:10:物理暴击CIRITICAL_MAGIC_ATTACK:11:魔法暴击ATTACK_SPEED:12:攻击速度SPELL_SPEED:13:释放速度MOVE_SPEED:14:移动速度DODGE:15:闪避DEX:16:命中HP_RECOVER:17:HP回复MP_RECOVER:18:MP回复HARD:19:硬直ADD_DAMAGE_PERCENT:20:增加伤害百分比ATTACK_ADD_RATE:21:物理伤害增加百分比MAGIC_ATTACK_ADD_RATE:22:魔法伤害增加百分比
     */
    private String buffType;
    /**
     * BUFF显示名称:例如：测试名称{0}级测试名称Lv{0}
     */
    private String buffDisName;

}