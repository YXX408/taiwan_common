package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class SkillMonster {
    /**
     * 名称
     */
    private String name;
    /**
     * 英文 一定要填技能配置对应文件夹
     */
    private String englishName;
    /**
     * 被动技能小图标
     */
    private String smallIcon;
    /**
     * 图标
     */
    private String icon;
    /**
     * 对应职业ID （可多写，0表示没有职业，-1表示所有职业）
     */
    private String jobID;
    /**
     * 技能基本速度 （1000）
     */
    private Integer speed;
    /**
     * 技能受角色速度影响类型 0：没影响 1：攻速影响 2：释放速度影响
     */
    private Integer speedEffectType;
    /**
     * 该技能是否分阶段受攻速影响 0：没影响 1：受分阶段速度影响
     */
    private Integer phaseRelatedSpeed;
    /**
     * 技能类型  ACTIVE:1:主动 PASSIVE:2:被动
     */
    private Integer skillType;
    /**
     * 技能分类  1:普通攻击 2:通用技能 3:职业技能 4:觉醒技能 5:工会技能
     */
    private Integer skillCategory;
    /**
     * 所属技能ID （0表示没有所属)
     */
    private Integer masterSkillID;
    /**
     * 技能效果 NONE:0:没类型 START_SKILL:1:起手技能 CONTINUOUS_SKILL:2:连招技能 HURT_SKILL:3:输出技能 DISPLACEMENT_SKILL:4:跑位技能 CONTROL_SKILL:5:控制技能 GRAB_SKILL:6:抓取技能 DEFENSE_SKILL:7:防御技能 ASSISTANT_SKILL:8:辅助技能 PHYSICAL_SKILL:9:物理 MAGIC_SKILL:10:魔法 NEAR_SKILL:11:近战 FAR_SKILL:12:远程
     */
    private String skillEffect;
    /**
     * 是否为BUFF技能  0:不是 1:是
     */
    private Integer isBuff;
    /**
     * 是否为QTE技能  0：不是 1：是
     */
    private Integer isQTE;
    /**
     * 是否为前冲技能  0：不是 1：是
     */
    private Integer isRunAttack;
    /**
     * 技能按键类型 0：正常 1：按两下 2：按第二下取消 3：按两下（2） 4：按第二下取消（2） 5：buff指示 6：按多次 7：每次按下都显示技能摇杆
     */
    private Integer skillPressType;
    /**
     * 可以按后跳取消技能 0：不能 1：能
     */
    private Integer pressBackJumpCancel;
    /**
     * 监视哪个buff （默认为0）
     */
    private Integer watchBuffID;
    /**
     * 是否可以换武器 （0表示不能换， 1表示可以换）
     */
    private Integer canSwithWeapon;
    /**
     * 技能CD开始阶段（0为默认值，技能开始时候CD）
     */
    private Integer cDPhase;
    /**
     * 是否为普攻Combo技能 （仅职业普攻触发Combo使用）
     */
    private Integer isAttackCombo;
    /**
     * 技能PVP携带方式  0.非角色技能 1.正常携带 2.前置CD 3.不能携带
     */
    private Integer canUseInPVP;
    /**
     * PVP技能攻击框缩放系数 (1000)
     */
    private Integer attackScalePVP;
    /**
     * 释放动作条件  STAND:1:站立 WALK:2:走路 RUN:3:跑步 JUMP:4:跳跃 BEHIT:5:被击 ENTERSCENE:6:进场景 INIT:7:技能加载 LOWHP:8:低血量狂暴 DAODI:9:倒地 MASTER_ATTACK:10:主人被击 JUMP_BACK:11:后跳
     */
    private String preCondition;
    /**
     * 低血量触发阈值（基数1000,可填2个，第一个为pve，第二个为pvp以竖线分隔） 主动技能使用
     */
    private Integer lowHpPercent;
    /**
     * 触发概率 非被动技能100%触发，被动技能按这个概率触发(*1000)
     */
    private Integer probability;
    /**
     * 触发效果ID被动技能用 （可填多个）
     */
    private Integer hitEffectIDs;
    /**
     * (PVP)触发效果ID被动技能用 （可填多个）
     */
    private Integer hitEffectIDsPVP;
    /**
     * buff信息表IDs
     */
    private Integer buffInfoIDs;
    /**
     * (PVP)buff信息表IDs
     */
    private Integer buffInfoIDsPVP;
    /**
     * 机制IDs
     */
    private Integer mechismIDs;
    /**
     * (PVP)机制IDs
     */
    private Integer mechismIDsPVP;
    /**
     * 可以打断的技能
     */
    private String interruptSkills;
    /**
     * 可以打断的技能(PVP)
     */
    private String interruptSkillsPVP;
    /**
     * 目标技能击中敌人才能打断的技能 （可以填多个)
     */
    private Integer hitInterruptSkills;
    /**
     * 取消技能时快速重置相机 0:否 1:是
     */
    private Integer isResetCamera;
    /**
     * 是否强制（是否能打断普攻） 0:否 1:是
     */
    private Integer isForce;
    /**
     * 是否可被主动打断 0:否 1:是
     */
    private Integer isCanCancel;
    /**
     * 是否可被敌人攻击打断 0:否 1:是
     */
    private Integer isCanDispose;
    /**
     * 蓄力是否默认开启 (如果没有蓄力则不管) 0:否 1:是
     */
    private Integer isChargeEnable;
    /**
     * 如果是蓄力技能是否隐藏蓄力条（0是显示，1是隐藏）
     */
    private Integer hideSpellBar;
    /**
     * 行走功能是否默认开启 0:否 1:是
     */
    private Integer isWalkEnable;
    /**
     * 技能中是否能接受行走 0:不能走 1:所有方向都能走 2:只能往面朝的方向走 3:变换方向 4:自由变换方向 5:只能X轴 6:只能Y轴 7:只能往面朝的反方向走
     */
    private Integer walkMode;
    /**
     * 接受移动的话的移动速度百分比 (1000表示)
     */
    private Integer walkSpeed;
    /**
     * PVP接受移动的话的移动速度百分比 (1000表示)
     */
    private Integer walkSpeedPVP;
    /**
     * 召唤条件对应的触发效果表ID （如果是召唤技能，则在这里填写触发效果ID，用于判断是否能放技能）
     */
    private Integer summonRestrainEffectID;
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
    private Integer hPCost;
    /**
     * MP消耗
     */
    private Integer mPCost;
    /**
     * 无色晶体消耗
     */
    private Integer crystalCost;
    /**
     * 释放时间
     */
    private Integer spellTime;
    /**
     * PVP释放时间
     */
    private Integer spellTimePVP;
    /**
     * 冷却时间
     */
    private String refreshTime;
    /**
     * 初始冷却时间
     */
    private Integer initCD;
    /**
     * 最小冷却时间
     */
    private Integer minCD;
    /**
     * PVP用冷却时间
     */
    private String refreshTimePVP;
    /**
     * PVP初始冷却时间
     */
    private Integer initCDPVP;
    /**
     * PVP最小冷却时间
     */
    private Integer minCDPVP;
    /**
     * 技能对象  FRIENDLY:1:我方 ENEMY:2:敌方
     */
    private Integer skillTarget;
    /**
     * 技能属性  0:无 1:光 2:火 3:冰 4:暗 5:不受影响
     */
    private Integer skillAttri;
    /**
     * 是否预转职技能 1：是 0：否
     */
    private Integer isPreJob;
    /**
     * 是否自动学习 1:学 0:不学
     */
    private Integer isStudy;
    /**
     * 开放等级
     */
    private Integer levelLimit;
    /**
     * 升级等级间隔
     */
    private Integer levelLimitAmend;
    /**
     * 可学习最高等级
     */
    private Integer topLevelLimit;
    /**
     * 理论最大等级
     */
    private Integer topLevel;
    /**
     * 前置技能
     */
    private Integer preSkills;
    /**
     * 前置技能等级
     */
    private Integer preSkillsLevel;
    /**
     * 后置技能
     */
    private Integer postSkills;
    /**
     * 满足后置技能的最低等级
     */
    private Integer needLevel;
    /**
     * 学习SP
     */
    private Integer learnSPCost;
    /**
     * 学习消耗物品
     */
    private Integer learnGoodCost;
    /**
     * 是否强制同步(技能时主动技能，不需要配置但可被动触发：自动格挡和格挡技能) 1：是 0：否
     */
    private Integer isForceSync;
    /**
     * 技能对应的按钮索引
     */
    private Integer bindButtonIndex;
    /**
     * 被动技能页签下 对应的按钮索引
     */
    private Integer passiveSkillBtnIndex;
    /**
     * 技能冒泡 （怪物用）
     */
    private String skillSpeech;
    /**
     * 技能冒泡概率 (1000表示百分百）
     */
    private Integer skillSpeechRand;
    /**
     * 应对技能提示
     */
    private String skillDealText;
    /**
     * 应对技能提示显示时间（毫秒） 不填表示5000毫秒，
     */
    private Integer skillDealTextDuration;
    /**
     * 现在给枪手普攻 向下打判断用(用后面两个参数当做判定范围)
     */
    private Integer switchSkillID;
    /**
     * rangeX
     */
    private Integer rangeX;
    /**
     * rangeY
     */
    private Integer rangeY;
    /**
     * 背后rangeX
     */
    private Integer backRangeX;
    /**
     * 技能权重
     */
    private Integer weight;
    /**
     * 攻击权重和攻击范围 权重越大优先放 front,back,top,down 2000,2000,1000,1000
     */
    private String attackInfo;
    /**
     * 技能Z值缩放系数（填小数，可成长）
     */
    private String zscale;
    /**
     * 技能Z值缩放系数（填小数，可成长） PVP
     */
    private Integer pVPZscale;
    /**
     * 技能操作类型 NONE=0, ADD=1, REPLACE=2
     */
    private Integer skillOperation;
    /**
     * 技能操作目标 NONE=0, SKILL=1, ACTOR=2
     */
    private Integer skillOpTarget;
    /**
     * 技能操作变量名
     */
    private String skillOpVar;
    /**
     * 技能操作变量值
     */
    private Integer skillOpValue;
    /**
     * 技能操作影响的技能
     */
    private Integer skillOpSkillIDs;
    /**
     * 需要武器类型（需要对应武器才能释放和生效）
     */
    private Integer needWeaponType;
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
    private Integer valueG;

}