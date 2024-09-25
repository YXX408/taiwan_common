package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class MonsterLevel {
    /**
     * 名称
     */
    private String name;
    /**
     * Boss出场的动画名字 （不填默认播Idle）
     */
    private String bossShowActionName;
    /**
     * 怪物信息描述
     */
    private String desc;
    /**
     * 怪物模式 1:普通 2:深渊 3:远古 4:死亡之塔 5:(召唤师的）召唤兽
     */
    private Integer monsterMode;
    /**
     * 类型 HERO:0:英雄 MONSTER:1:怪物 ELITE:2:精英 BOSS:3:boss NPC:4:npc HELL:5:深渊 ACTIVITYMONSTER:6:远古 ACCOMPANY:7:随从 SKILL_MONSTER:8:技能实现的怪物 EGG:9:彩蛋 ZHS:10:召唤兽(仅buffinfo使用)
     */
    private Integer type;
    /**
     * 地下城是否显示怪物头像 1：是 0：否
     */
    private Integer isShowPortrait;
    /**
     * 阵营 C_HERO:0:正义 C_ENEMY:1:邪恶 C_ENEMY2:2:邪恶2
     */
    private Integer camp;
    /**
     * 怪物种族 NONE:0:非怪物 EVIL:1:恶魔 UNDEAD:2:不死 ELF:3:精灵 HUMAN:4:人类 HOMINIS:5:人型 PUPPET:6:傀儡 MACHINE:7:机械
     */
    private Integer monsterRace;
    /**
     * 资源ID
     */
    private Integer mode;
    /**
     * 体重（百分比）
     */
    private Integer weight;
    /**
     * 自动战斗是否 要优先攻击 0：不需要 1：需要
     */
    private Integer autoFightNeedAttackFirst;
    /**
     * 技能实现的怪物 是否可以被攻击 0：不可以 1：可以
     */
    private Integer skillMonsterCanBeAttack;
    /**
     * 模型缩放（百分比）
     */
    private Integer scale;
    /**
     * 怪物的Y轴宽度（适用于Y轴比较宽的怪物），填浮点
     */
    private float enhanceRadius;
    /**
     * 强制指定头顶高度 （浮点） 怪物头顶说话框，血条，施法条
     */
    private float overHeadHeight;
    /**
     * 指定上头顶buff高度 （浮点） 影响怪物名字
     */
    private float buffOriginHeight;
    /**
     * 移动速度（百分比整数） 只影响逻辑移动速度，不影响动画播放速度
     */
    private Integer walkSpeed;
    /**
     * 移动速度动画播放（百分比，默认100）
     */
    private Integer walkAnimationSpeedPerent;
    /**
     * 怪物称号
     */
    private Integer monsterTitle;
    /**
     * 普通攻击ID
     */
    private Integer attackSkillID;
    /**
     * 起身是否使用霸体 （0表示不用，否则填霸体的时间(1000) 概率在全局
     */
    private Integer getupBati;
    /**
     * 起身技能ID几率
     */
    private Integer getupSkillRand;
    /**
     * 起身技能ID
     */
    private Integer getupSkillID;
    /**
     * 被击触发技能几率
     */
    private Integer hitSkillRand;
    /**
     * 被击触发技能ID
     */
    private Integer hitSkillID;
    /**
     * 携带技能ID （1|2|3…，0表示没有技能，这里不包含普攻ID）
     */
    private String skillIDs;
    /**
     * 被击效果
     */
    private String hurt;
    /**
     * 特有脚底光环特效
     */
    private String footEffectName;
    /**
     * 角色默认的武器模型路径（随从用）
     */
    private String weaponModel;
    /**
     * 角色默认的武器挂点（随从用）
     */
    private String weaponLocator;
    /**
     * 经验
     */
    private Integer exp;
    /**
     * 词缀表现特效
     */
    private String prefixEffect;
    /**
     * 默认攻击击中音效ID （对应音效表）
     */
    private Integer defaultAttackHitSFXID;
    /**
     * 掉落ID
     */
    private String dropID;
    /**
     * 每日掉落次数上限
     */
    private Integer dailyDropNum;
    /**
     * 奖励包
     */
    private Integer awardID;
    /**
     * 存在时间 （0表示没有存在时间，单位毫秒）
     */
    private Integer existDuration;
    /**
     * PVP存在时间 （0表示没有存在时间，单位毫秒）
     */
    private Integer pVPExistDuration;
    /**
     * 浮空高度（只适合 浮空的怪） 默认为0表示浮空
     */
    private float intValue;
    /**
     * 描述A
     */
    private String descriptionA;
    /**
     * 数值A
     */
    private Integer valueA;
    /**
     * 走路冒泡
     */
    private String walkSpeech;
    /**
     * 攻击冒泡
     */
    private Integer attackSpeech;
    /**
     * 出生冒泡
     */
    private Integer birthSpeech;
    /**
     * 强制显示名字 0:否 1：是
     */
    private String showName;
    /**
     * 是否显示血条 0:是 1：否
     */
    private Integer showHPBar;
    /**
     * 强制显示脚底光环 0:否 1：是
     */
    private Integer showFootBar;
    /**
     * 出生能力设定 (0表示不改)
     */
    private String abilityChange;
    /**
     * 出生buff，可以填多个|
     */
    private String bornBuff;
    /**
     * 出生buff2，这里填Buff信息表可以填多个|
     */
    private String bornBuff2;
    /**
     * 出生携带机制 （可以填多个）
     */
    private String bornMechanism;
    /**
     * HPMAX固定值 （0表示不设置，优先级高于HPMAX%）
     */
    private Integer maxFixHp;
    /**
     * HPMAX%
     */
    private float maxHp;
    /**
     * MPMAX%
     */
    private Integer maxMp;
    /**
     * HP回复%
     */
    private Integer hpRecover;
    /**
     * MP回复%
     */
    private Integer mpRecover;
    /**
     * 物理攻击%
     */
    private Integer attack;
    /**
     * 魔法攻击%
     */
    private Integer magicAttack;
    /**
     * 物理防御%
     */
    private Integer defence;
    /**
     * 魔法防御%
     */
    private Integer magicDefence;
    /**
     * 攻击速度(1000)%
     */
    private Integer attackSpeed;
    /**
     * 施法速度%
     */
    private Integer spellSpeed;
    /**
     * 移动速度(1000)%
     */
    private Integer moveSpeed;
    /**
     * 物理暴击%
     */
    private Integer ciriticalAttack;
    /**
     * 魔法暴击%
     */
    private Integer ciriticalMagicAttack;
    /**
     * 命中%
     */
    private Integer dex;
    /**
     * 闪避%
     */
    private Integer dodge;
    /**
     * 僵直%
     */
    private Integer frozen;
    /**
     * 硬直%
     */
    private Integer hard;
    /**
     * 冷却缩减%
     */
    private Integer cdReduceRate;
    /**
     * 基础力量%
     */
    private Integer baseAtk;
    /**
     * 基础智力%
     */
    private Integer baseInt;
    /**
     * 基础体力%
     */
    private Integer sta;
    /**
     * 基础精神%
     */
    private Integer spr;
    /**
     * 无视物理防御攻击增加%
     */
    private Integer ignoreDefAttackAdd;
    /**
     * 无视魔法防御攻击增加%
     */
    private Integer ignoreDefMagicAttackAdd;
    /**
     * 独立攻击力
     */
    private Integer baseIndependence;
    /**
     * 攻击附带属性 0:无 1:光 2:火 3:冰 4:暗
     */
    private Integer elements;
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
     * 是否启用保护机制 0：否 1：启用
     */
    private Integer useProtect;
    /**
     * 浮空保护触发千分比 （默认200）
     */
    private Integer protectintPercent;
    /**
     * 浮空保护再次触发千分比 （默认20）
     */
    private Integer protectintPercent2;
    /**
     * 倒地保护触发千分比 （默认150）
     */
    private Integer protectGroundPercent;
    /**
     * 站立保护触发千分比 （默认200）
     */
    private Integer protectStandPercent;
    /**
     * 出生是否运行AI Start:0:运行AI None:1:不运行AI
     */
    private Integer bornAI;
    /**
     * 怪物攻击类型 0：肉搏 1：远程
     */
    private Integer aICombatType;
    /**
     * 怪物目标类型（可设多个） 0：最近的 1：等级最低 2：等级最高 3：HP最低 4：HP最高 5：攻击者 6：倒倒地者
     */
    private String aITargetType;
    /**
     * 视野 (1000) 填0表示默认值4000
     */
    private Integer aISight;
    /**
     * 追击视野 （1000） 填0表示是视野的1.5倍
     */
    private Integer aIChase;
    /**
     * 好战度 （0-100） 填0表示默认值50
     */
    private Integer aIWarlike;
    /**
     * 跟随距离 （0表示不跟随）
     */
    private Integer aIFollowDistance;
    /**
     * 保持距离 （远程怪物用，0表示不保持距离）
     */
    private Integer aIKeepDistance;
    /**
     * 选择攻击间隔 （1000ms） 填0表示默认值2000
     */
    private Integer aIAttackDelay;
    /**
     * 选择行走目标地间隔 （1000ms） 填0表示默认3000
     */
    private Integer aIDestinationChangeTerm;
    /**
     * 选择目标间隔 (1000） 填0表示默认值2000
     */
    private Integer aIThinkTargetTerm;
    /**
     * 攻击喜好 概率,技能ID,front,back,top,down 100,5000,500,200,100,100
     */
    private String aIAttackKind;
    /**
     * 释放技能后的发呆时间
     */
    private String dazeTime;
    /**
     * 找不到攻击对象的时候的行为 0:Idle 1:Wander
     */
    private Integer aIIdleMode;
    /**
     * 是否是APC，APC会跑 0:不是 1:是
     */
    private Integer aIIsAPC;
    /**
     * 待机的概率 默认50（0-100）
     */
    private Integer aIIdleRand;
    /**
     * 待机时间 （毫秒，默认1000）
     */
    private Integer aIIdleDuration;
    /**
     * 逃跑的概率 默认50（0-100）
     */
    private Integer aIEscapeRand;
    /**
     * Wander的概率 默认50
     */
    private Integer aIWanderRand;
    /**
     * 游荡的范围 (默认1，表示-2，-1，0,1,2）
     */
    private Integer aIWanderRange;
    /**
     * 后退的范围 （默认1，表示-5,-4,-3，-2,-1,0,1,2,3,4,5）
     */
    private Integer aIWalkBackRange;
    /**
     * Y轴优先的概率 （远程，默认50）
     */
    private Integer aIYFirstRand;
    /**
     * 最大连续行走指令 （默认0表示没有限制）
     */
    private Integer aIMaxWalkCmdCount;
    /**
     * 最大连续Idle指令 （默认0表示没有限制）
     */
    private Integer aIMaxIdleCmdCount;
    /**
     * APC用武器tag （跟角色换武器一样）
     */
    private Integer aIWeaponTag;
    /**
     * APC是否用角色的技能配置 0：不是 1：是
     */
    private Integer aPCIsSpecialConfig;
    /**
     * APC是否换武器（对应模型资源表ID） 0：表示没有
     */
    private Integer aPCWeaponRes;
    /**
     * APC武器强化等级 (默认0)
     */
    private Integer aPCWeaponStrengthLevel;
    /**
     * ACTION行为树配置路径
     */
    private String aIActionPath;
    /**
     * DESTINATIONSELET行为树配置路径
     */
    private String aIDestinationSelectPath;
    /**
     * EVENT行为树配置路径
     */
    private String aIEventPath;
    /**
     * 变身不同阶段不同喜好 (第一个是本来的模型)
     */
    private String attackInModelStage;
    /**
     * 最后一刀如果是暴击或者伤害超过最大血量的30%，是否播死亡动作（默认填0）
     */
    private Integer playDeadAction;
    /**
     * 怪物高度
     */
    private Integer height;

}