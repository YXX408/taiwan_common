package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class JarItemPool {
    /**
     * 罐子名字
     */
    private String nouse1;
    /**
     * 道具名字
     */
    private String nouse2;
    /**
     * 罐子类别
     */
    private Integer jarType;
    /**
     * 道具ID
     */
    private Integer itemID;
    /**
     * 随机强化
     */
    private String strength;
    /**
     * 职业
     */
    private String occu;
    /**
     * 数量
     */
    private Integer itemNum;
    /**
     * 权重
     */
    private Integer itemWeight;
    /**
     * 修正1
     */
    private Integer fix1;
    /**
     * 修正2
     */
    private float fix2;
    /**
     * 修正2次数
     */
    private Integer fix2Num;
    /**
     * 修正上限
     */
    private Integer fixMax;
    /**
     * 修正下限
     */
    private Integer fixMin;
    /**
     * 最低开箱数
     */
    private Integer opneCondition;
    /**
     * 最低充值
     */
    private Integer charge;
    /**
     * 投放数量
     */
    private Integer getNumLimite;
    /**
     * 是否公告&记录
     */
    private Integer needAnounce;
    /**
     * 显示特效
     */
    private Integer showEffect;
    /**
     * 是否珍贵道具
     */
    private Integer isTreasure;
    /**
     * 礼包奖励是否公告
     */
    private Integer jarGiftNeedAnount;

}