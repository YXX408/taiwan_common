package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class BuffInfo {
    /**
     * BUFF名字
     */
    private String name;
    /**
     * BUFFICON
     */
    private String icon;
    /**
     * BUFF描述
     */
    private String description;
    /**
     * 装备效果描述类型 Common:0:通用 SkillLevel:1:技能等级加成
     */
    private Integer descType;
    /**
     * BUFF详细描述
     */
    private String detailDescription;
    /**
     * BUFF排序ID
     */
    private Integer sortID;
    /**
     * BufferType（随从专用) BTR_LV:0:等级类型加成 BTR_ATTR:1:属性类型加成
     */
    private Integer bufferType;
    /**
     * 随从洗炼是否需要红点提示
     */
    private Integer needHint;
    /**
     * BUFF ID  （只能填一个）
     */
    private Integer buffID;
    /**
     * 特殊怪物类型配不同的buff id (例子 对boss生效变成110701，对精英怪生效变成170503 3;110701|2;170503,对召唤兽生效变成10;170503)
     */
    private String monsterTypeMap;
    /**
     * buff固定等级 （不跟技能有关的buff用这个等级， 填0表示随外部等级,比如技能等级 填固定值就是用固定等级 填成长，就用外部等级进行成长)
     */
    private String buffLevel;
    /**
     * BUFF 目标 0：自身 1：攻击对象（BUFF半径范围为4的时候选择） 2：技能 3：范围敌人 4：范围友军不包含自己 5：友军包含自己（需要填写BUFFcondition） 6：友军不包含自己（需要填写BUFFcondition） 7：范围友军 包含自己 8：友军（不包含召唤兽） 9：敌军（不包含召唤兽） 10：范围友军包含自己不包含召唤兽
     */
    private Integer buffTarget;
    /**
     * BUFF目标选择范围 （在BUFF 目标选择3或4的时候设置）
     */
    private Integer buffTargetRadius;
    /**
     * 如果是给技能加buff 这里填技能ID（可以填多个）
     */
    private String skillID;
    /**
     * 给指定怪物模式(对应于怪物表的怪物模式字段)
     */
    private Integer monsterModeType;
    /**
     * BUFF附加概率 (*1000)
     */
    private String attachBuffRate;
    /**
     * BUFF时间（ms） 0：表示当前帧到该动画阶段结束 -1：表示永久buff
     */
    private String attachBuffTime;
    /**
     * 初始CD（ms）
     */
    private Integer buffInfoStartCD;
    /**
     * 触发CD间隔 0:没有间隔 （可随等级成长）
     */
    private Integer buffInfoCD;
    /**
     * 异常BUFF攻击力
     */
    private String buffAttack;
    /**
     * BUFF释放条件 -1：进入地下城 0：无条件 1：攻击时 2：被击时 3：释放技能时 4：进入范围 5：物理攻击 6：魔法攻击 7：释放指定技能 8：起身 9：开始行走 10：破招时 11：暴击时 12:被暴击时 13:背击时 14:被背击时 15:指定技能命中 16:近战 17:远程 18:光属性攻击 19:火属性攻击 20:冰属性攻击 21:暗属性攻击 22:攻击时Miss 23:被击时Miss 24:指定技能释放完成 25:玩家死亡 26:技能释放(除普通攻击) 27:命中伤害目标后
     */
    private Integer buffCondition;
    /**
     * 延迟多长时间触发buff （毫秒,0表示没有延迟）
     */
    private Integer buffDelay;
    /**
     * BUFF范围半径 （如果BUFF释放条件选择“4：范围", 1000表示1单位)
     */
    private String buffRangeRadius;
    /**
     * BUFF范围check 间隔 （默认1000ms,间隔越少越准确）
     */
    private Integer buffRangeCheckInterval;
    /**
     * BUFF释放条件指定技能 或者 指定技能命中时 （可以填多个）
     */
    private String conditionSkillID;
    /**
     * BUFF等级与指定技能等级关联
     */
    private Integer relatedSkillID;
    /**
     * 特效名称
     */
    private String effectName;
    /**
     * 特效挂点
     */
    private String effectLocateName;
    /**
     * 给指定等级段的技能加buff（装备专用） 填写格式:等级下限|等级上限（15|40）或者只填(15)表明等级为15级的 注：不可和其他加技能等级的用同一个BUFF
     */
    private String relatedSkillLV;

}