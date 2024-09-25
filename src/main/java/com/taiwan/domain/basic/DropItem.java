package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class DropItem {
    /**
     * 掉落组ID
     */
    private Integer groupID;
    /**
     * 个数方案
     */
    private String chooseNumSet;
    /**
     * 个数权重
     */
    private String numProbSet;
    /**
     * 掉落类型 0:物品 1:方案
     */
    private Integer dataType;
    /**
     * 物品ID
     */
    private Integer itemID;
    /**
     * 权重
     */
    private Integer itemProb;
    /**
     * 物品数量
     */
    private String itemNum;
    /**
     * 是否稀有控制
     */
    private Integer isRareControl;
    /**
     * 任务ID
     */
    private Integer taskID;
    /**
     * 职业加成
     */
    private String occuAddition;
    /**
     * 职业加成权重
     */
    private Integer additionProb;
    /**
     * 掉落物品类型 0:普通物品 1:金币 2:神器 3:任务物品 4:史诗 5:珍贵材料 6:领主粉 7:宇宙之眼 8:翻牌 9:深渊票 10:远古票 14：虚无之源
     */
    private Integer dropItemType;
    /**
     * 掉落提示
     */
    private Integer dropNotice;
    /**
     * 备注
     */
    private String text;
    /**
     * 活动ID
     */
    private String activityID;
    /**
     * 特殊副本识别字段 1：克拉西团本 2：活动额外掉落
     */
    private String mark;
    /**
     * vip等级
     */
    private String vip;
    /**
     * vip掉落上限控制Id
     */
    private Integer vipDropLimitId;

}