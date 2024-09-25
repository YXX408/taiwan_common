package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class DungeonChest {
    /**
     * 地下城ID
     */
    private Integer dungeonID;
    /**
     * 评分 C:0 B:1 A:2 S:3 SS:4 SSS:5
     */
    private Integer score;
    /**
     * 金币方案
     */
    private Integer goldID;
    /**
     * 普通宝箱
     */
    private Integer normalChestID;
    /**
     * VIP宝箱
     */
    private Integer vipChestID;
    /**
     * 付费宝箱
     */
    private Integer payChestID;
    /**
     * 付费货币
     */
    private Integer payChestCostItem;
    /**
     * 付费金额
     */
    private Integer payChestCost;

}