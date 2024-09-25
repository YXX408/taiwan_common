package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Exp {
    /**
     * 经验（非累加）
     */
    private Integer totalExp;
    /**
     * Sp获得(非累加)
     */
    private Integer sp;
    /**
     * 技能槽位
     */
    private Integer skillNum;
    /**
     * 日常任务选择器
     */
    private String dailyTaskSelector;
    /**
     * 随从槽位
     */
    private Integer retinueNum;
    /**
     * 技能点剩余提示
     */
    private Integer spLeft;
    /**
     * pvp技能点剩余提示 在决斗场中
     */
    private Integer spPvp;
    /**
     * 冒险队经验加成百分比
     */
    private Integer adventureTeamExpAddition;
    /**
     * 评分
     */
    private Integer score;
    /**
     * 信用点券月获得上限
     */
    private Integer creditPointMonthGetNum;
    /**
     * 信用点券拥有上限
     */
    private Integer creditPointOwnNum;
    /**
     * 信用点券月转化上限
     */
    private Integer creditPointMonthConversionNum;

}