package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EffectMonster {
    /**
     * 名称
     */
    private String name;
    /**
     * 对应的技能ID
     */
    private Integer skillID;
    /**
     * 框的攻击对象类型 H_NONE:0:不指定 H_ENEMY:1:敌人 H_FRIEND:2:友方
     */
    private Integer effectTargetType;
    /**
     * 是否有伤害 -1:否，触发 0:否 1:是
     */
    private Integer hasDamage;
    /**
     * 是否FRIEND伤害(不触发保护/显示白字/不累计连击) 0:否 1:是
     */
    private Integer isFriendDamage;
    /**
     * 躲避伤害类型  AV_NONE:0:无 AV_AREA:1:指定区域 AV_FACINGAWAY:2:背对释放者
     */
    private Integer avoidDamageType;
    /**
     * 伤害类型  PHYSIC:1:物理 MAGIC:2:魔法
     */
    private Integer damageType;
    /**
     * 伤害距离类型 NONE:0:无距离 NEAR:1:近 FAR:2:远
     */
    private Integer damageDistanceType;
    /**
     * 最大伤害次数 （无效）
     */
    private String damageMaxCount;
    /**
     * 暴击率 （增加这次攻击的暴击率1000，可成长）
     */
    private Integer attachCritical;
    /**
     * 穿透率 （子弹用，1000，可成长）
     */
    private Integer hitThroughRate;
    /**
     * 攻击附加效果  0:无  1:光  2:火  3:冰  4:暗
     */
    private Integer magicElementType;
    /**
     * 装备属性攻击是否生效 （不填默认0） 0:否 1:是
     */
    private Integer magicElementISuse;
    /**
     * 被攻击者是否需要击散效果  0:不需要  1:需要
     */
    private Integer hitSpreadOut;
    /**
     * 伤害百分比数值(APC用）
     */
    private Integer damageRateAPC;
    /**
     * 伤害百分比数值（例子） 1.单值 100 2.固定成长 100;50 3.每级固定值 1001,2001,3001
     */
    private String damageRate;
    /**
     * 伤害固定数值
     */
    private String damageFixedValue;
    /**
     * pvp用伤害百分比数值
     */
    private String damageRatePVP;
    /**
     * pvp用伤害固定数值
     */
    private String damageFixedValuePVP;
    /**
     * 对某些种族的 怪有伤害加成
     */
    private Integer attachMonsterRace;
    /**
     * 对某些种族的怪的 伤害加成百分比
     */
    private Integer attachDamageRate;
    /**
     * 受闪避影响 0:否 1:是
     */
    private Integer isCanMiss;
    /**
     * 是否只能打抓取 0:否 1:是
     */
    private Integer hitGrab;
    /**
     * 僵直值
     */
    private Integer hardValue;
    /**
     * 是否可以破霸体
     */
    private Integer useStandardWeight;
    /**
     * 清除角色的某些状态 1：清浮空 2：清跳跃 4：清倒地
     */
    private String clearTargetState;
    /**
     * 是否使用标准重力， 并且无视阻挡
     */
    private Integer useNoBlock;
    /**
     * 僵直最大移动距离
     */
    private float frozenDistanceMax;
    /**
     * 攻击推力(x) (1100等于1）
     */
    private Integer attack;
    /**
     * 浮空力(y)
     */
    private Integer floatingRate;
    /**
     * 打到空中敌人是否有X轴推力 (1100等于1）
     */
    private Integer hitFloatXForce;
    /**
     * 打到空中敌人是否有Y轴推力 (1100等于1）
     */
    private Integer hitFloatYForce;
    /**
     * 重复攻击间隔 （0表示不是重复攻击，单位是毫秒）
     */
    private String repeatAttackInterval;
    /**
     * 击中死亡是否要浮空 0：不需要 1：需要
     */
    private Integer hitDeadFall;
    /**
     * 中招反应  HIT:0:普通被击 HITFLY:1:击飞 NO_EFFECT:2:没有效果
     */
    private Integer hitEffect;
    /**
     * 击中的时候是否停顿 0：不停顿 1：停顿
     */
    private Integer hitPause;
    /**
     * 击中停顿的时间 （ms）
     */
    private Integer hitPauseTime;
    /**
     * 停顿的时候特效是否停止 0：停顿 1：不停顿
     */
    private Integer hitEffectPause;
    /**
     * 击中屏震时间 （ms）
     */
    private Integer hitScreenShakeTime;
    /**
     * 击中屏震速度
     */
    private Integer hitScreenShakeSpeed;
    /**
     * 击中屏震x振幅 （1000表示1单位)
     */
    private Integer hitScreenShakeX;
    /**
     * 击中屏震y振幅 （1000表示1单位)
     */
    private Integer hitScreenShakeY;
    /**
     * 新版震屏效果ID
     */
    private Integer screenShakeID;
    /**
     * 产生实体的ID （对应到单位表，可填多个）
     */
    private Integer attachEntity;
    /**
     * 召唤ID
     */
    private Integer summonID;
    /**
     * 召唤位置类型 FACE:0:面前一个单位 ORIGIN:1:原地 FACE_FORCE:2:面前一个单位不管阻挡 FACE_BLACK:3:面前没有遮挡的位置
     */
    private Integer summonPosType;
    /**
     * 召唤位置类型2 是否考虑阻挡|召唤位置类型距离 1：考虑阻挡 2：不考虑阻挡
     */
    private String summonPosType2;
    /**
     * 召唤表现 0:无 1:法阵
     */
    private Integer summonDisplay;
    /**
     * 一次召唤数量 
     */
    private Integer summonNum;
    /**
     * 召唤等级
     */
    private String summonLevel;
    /**
     * 此召唤数量上限 （0表示没有上限）
     */
    private Integer summonNumLimit;
    /**
     * 召唤组数量上限 （0表示没有上限）
     */
    private Integer summonGroupNumLimit;
    /**
     * 召唤数量组ID （0表示没有）
     */
    private Integer summonGroup;
    /**
     * 召唤物在召唤主死亡的时候是否死亡 0：否 1：是
     */
    private Integer summonRelation;
    /**
     * 随机在下面列表里召唤
     */
    private String summonRandList;
    /**
     * 是否将上次召唤的怪物杀死                       0：否                        1：是
     */
    private Integer killLastSummon;
    /**
     * BUFF ID  （只能填一个）
     */
    private Integer buffID;
    /**
     * buff固定等级 （不跟技能有关的buff用这个等级)
     */
    private String buffLevel;
    /**
     * BUFF 目标 SELF:0:自身 ENEMY:1:攻击对象
     */
    private Integer buffTarget;
    /**
     * BUFF附加概率 (*1000)
     */
    private String attachBuffRate;
    /**
     * BUFF时间（ms） 0：表示当前帧到该动画阶段结束 -1：表示永久buff
     */
    private String attachBuffTime;
    /**
     * 异常BUFF攻击力
     */
    private String buffAttack;
    /**
     * BUFF 信息表 ID  （可以填多个）
     */
    private String buffInfoID;
    /**
     * BUFF 信息表 ID  （PVP用，可以填多个，如果不填就用前面的）
     */
    private String pVPBuffInfoID;

}