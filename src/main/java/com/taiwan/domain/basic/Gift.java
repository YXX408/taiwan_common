package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Gift {
    /**
     * 道具ID
     */
    private Integer itemID;
    /**
     * 道具名字：notexport
     */
    private String nouse1;
    /**
     * 礼包ID（真礼包ID，非吃鸡不用填）
     */
    private Integer giftPackID;
    /**
     * 道具数量
     */
    private Integer itemCount;
    /**
     * 推荐职业
     */
    private String recommendJobs;
    /**
     * 获得权重
     */
    private float weight;
    /**
     * 有效等级
     */
    private String levels;
    /**
     * 装备类型 EQUIP_NORMAL:0:普通 EQUIP_HAVE_SMELL:1:带气息 EQUIP_RED:2:红字
     */
    private Integer equipType;
    /**
     * 强化等级
     */
    private Integer strengthen;

}