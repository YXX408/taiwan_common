package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EquipForge {
    /**
     * 备注
     */
    private String note;
    /**
     * 制作材料信息
     */
    private String material;
    /**
     * 价格
     */
    private String price;
    /**
     * 类别EQUIP:1:装备EXPENDABLE:2:消耗MATERIAL:3:材料TASK:4:任务FASHION:5:装扮INCOME:6:收益ENERGY:7:能量石FUCKTITTLE:8:称号系统VirtualPack:9:虚拟礼包PET:10:宠物HEAD_FRAME:12:头像框ITEM_NEWTITLE:14:头衔SKILL_CHIJI:13:吃鸡技能ITEM_INSCRIPTION:15:铭文ITEM_MONOPOLY_CARD:17:大富翁卡牌
     */
    private String type;
    /**
     * 主类别名称
     */
    private String mainTypeName;
    /**
     * 子类别名称
     */
    private String subTypeName;
    /**
     * 推荐等级
     */
    private Integer recommendLevel;
    /**
     * 推荐职业
     */
    private String recommendJobs;

}