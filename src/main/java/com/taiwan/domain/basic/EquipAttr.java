package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EquipAttr {
    /**
     * 名称（备注项）
     */
    private String name;
    /**
     * 物理攻击
     */
    private Integer atk;
    /**
     * 法术攻击
     */
    private Integer magicAtk;
    /**
     * 独立攻击力
     */
    private Integer independence;
    /**
     * 物理防御
     */
    private Integer def;
    /**
     * 法术防御
     */
    private Integer magicDef;
    /**
     * 力量(有浮点参与属性计算)
     */
    private Integer strenth;
    /**
     * 智力(有浮点参与属性计算)
     */
    private Integer intellect;
    /**
     * 精神(有浮点参与属性计算)
     */
    private Integer spirit;
    /**
     * 体力(有浮点参与属性计算)
     */
    private Integer stamina;
    /**
     * 物理技能耗蓝变化(百分比)
     */
    private Integer phySkillMp;
    /**
     * 物理CD变化
     */
    private Integer phySkillCd;
    /**
     * 魔法技能耗蓝变化(百分比)
     */
    private Integer magSkillMp;
    /**
     * 魔法CD变化
     */
    private Integer magSkillCd;
    /**
     * HP最大值
     */
    private Integer hPMax;
    /**
     * MP最大值
     */
    private Integer mPMax;
    /**
     * HP恢复
     */
    private Integer hPRecover;
    /**
     * MP恢复
     */
    private Integer mPRecover;
    /**
     * 攻击速度(千分比)
     */
    private Integer attackSpeedRate;
    /**
     * 施放速度(千分比)
     */
    private Integer fireSpeedRate;
    /**
     * 移动速度(千分比)
     */
    private Integer moveSpeedRate;
    /**
     * 城镇移动速度（千分比）
     */
    private Integer townMoveSpeedRate;
    /**
     * 命中率(千分比)
     */
    private Integer hitRate;
    /**
     * 回避率(千分比)
     */
    private Integer avoidRate;
    /**
     * 物理暴击(千分比)
     */
    private Integer physicCrit;
    /**
     * 魔法暴击(千分比)
     */
    private Integer magicCrit;
    /**
     * 硬直
     */
    private Integer spasticity;
    /**
     * 跳跃力
     */
    private Integer jump;
    /**
     * 抗魔值
     */
    private Integer resistMagic;
    /**
     * 攻击附带属性1:光2:火3:冰4:暗
     */
    private String elements;
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
     * 装备评分
     */
    private Integer attachRateScore;
    /**
     * 附加buffinfoID（可多个,关联buff信息表）
     */
    private String attachBuffInfoIDs;
    /**
     * 附加机制ID（可多个，关联被动技能信息表）
     */
    private String attachMechanismIDs;
    /**
     * [PVP]附加buffinfoID（可多个,关联buff信息表）
     */
    private String pVPAttachBuffInfoIDs;
    /**
     * [PVP]附加机制ID（可多个，关联被动技能信息表）
     */
    private String pVPAttachMechanismIDs;
    /**
     * 附加buff描述
     */
    private String attachBuffDesc;
    /**
     * 附加机制描述
     */
    private String attachMechanismDesc;
    /**
     * 深渊史诗掉落概率加成
     */
    private Integer dungeonEpicDropAddition;

}