package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class ChargeMall {
    /**
     * 序号
     */
    private Integer sort;
    /**
     * 描述
     */
    private String desc;
    /**
     * 标签 推荐:1
     */
    private String tags;
    /**
     * 充值金额
     */
    private Integer chargeMoney;
    /**
     * VIP积分
     */
    private Integer vipScore;
    /**
     * 每日限制数量
     */
    private Integer dailyLimitNum;
    /**
     * 道具ID
     */
    private Integer itemID;
    /**
     * 数量
     */
    private Integer itemNum;
    /**
     * 首充数量补偿
     */
    private Integer firstAddNum;
    /**
     * 非首充数量补偿
     */
    private Integer unFirstAddNum;
    /**
     * Icon
     */
    private Integer icon;
    /**
     * 名称
     */
    private String name;

}