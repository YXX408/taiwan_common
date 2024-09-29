package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Effect {
    /**
     * 名称
     */
    private String name;
    /**
     * 对应的技能ID
     */
    private Integer skillID;
    /**
     * 伤害类型  PHYSIC:1:物理 MAGIC:2:魔法
     */
    private Integer damageType;
    /**
     * 暴击率 （增加这次攻击的暴击率1000，可成长）
     */
    private String attachCritical;
    /**
     * 攻击附加效果  0:无  1:光  2:火  3:冰  4:暗
     */
    private Integer magicElementType;
    /**
     * 装备属性攻击是否生效 （不填默认0） 0:否 1:是
     */
    private Integer magicElementISuse;
    /**
     * 伤害百分比数值（例子） 1.单值 100 2.固定成长 100;50 3.每级固定值 1001,2001,3001
     */
    private String damageRate;
    /**
     * 伤害固定数值
     */
    private String damageFixedValue;
    /**
     * 僵直值
     */
    private String hardValue;
    /**
     * 是否可以破霸体
     */
    private Integer useStandardWeight;
    /**
     * 僵直最大移动距离
     */
    private float frozenDistanceMax;
    /**
     * 攻击推力
     */
    private String attack;
    /**
     * 浮空力(y)
     */
    private String floatingRate;
    /**
     * 击中死亡是否要浮空 0：不需要 1：需要
     */
    private Integer hitDeadFall;
    /**
     * 中招反应  HIT:0:普通被击 HITFLY:1:击飞 NO_EFFECT:2:没有效果
     */
    private Integer hitEffect;
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
    private String summonNum;
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
    private String summonGroupNumLimit;
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
    /**
     * 触发的攻击特效
     */
    private String effectType;

}