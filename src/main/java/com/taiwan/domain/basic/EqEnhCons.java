package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EqEnhCons {
    /**
     * 品质
     */
    private Integer quality;
    /**
     * 增幅等级
     */
    private Integer enhanceLevel;
    /**
     * 装备等级
     */
    private Integer level;
    /**
     * 金币消耗
     */
    private Integer needGold;
    /**
     * 金币返还
     */
    private Integer returnGold;
    /**
     * 消耗矛盾结晶体 （道具ID）
     */
    private Integer itemID;
    /**
     * 消耗矛盾结晶体数量
     */
    private Integer itemNum;
    /**
     * 浓缩的纯洁之骇返还（道具ID）
     */
    private Integer returnItemID;
    /**
     * 浓缩的纯洁之骇返还 概率_数量|概率_数量
     */
    private String returnItemRule;
    /**
     * 强烈之痕迹返还（道具ID）
     */
    private Integer returnItemID2;
    /**
     * 强烈之痕迹返还 概率_数量|概率_数量
     */
    private String returnItemRule2;

}