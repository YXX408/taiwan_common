package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EqSuit {
    /**
     * 套装名称
     */
    private String name;
    /**
     * 套装等级
     */
    private Integer suitsLv;
    /**
     * 套装装备ID列表
     */
    private String equipIDs;
    /**
     * 2套装效果
     */
    private Integer twoEquipsAttrID;
    /**
     * 3套装效果
     */
    private Integer threeEquipsAttrID;
    /**
     * 4套装效果
     */
    private Integer fourEquipsAttrID;
    /**
     * 5套装效果
     */
    private Integer fiveEquipsAttrID;
    /**
     * 6套装效果
     */
    private Integer sixEquipsAttrID;
    /**
     * 8套装效果
     */
    private Integer eightEquipsAttrID;
    /**
     * 9套装效果
     */
    private Integer nineEquipsAttrID;
    /**
     * 套装描述
     */
    private String description;
    /**
     * 套装评分修正
     */
    private Integer adjust;

}