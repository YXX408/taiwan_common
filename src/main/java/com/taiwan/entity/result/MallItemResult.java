package com.taiwan.entity.result;

import lombok.Data;

@Data
public class MallItemResult {
    private String mallId;
    /**
     * 礼包名字
     */
    private String giftpackname;
    /**
     * 商城类别 （参考商城表ID）
     */
    private Integer type;
    /**
     * 职业筛选
     */
    private Integer jobtype;
    /**
     * 道具id
     */
    private Integer itemid;
    /**
     * 道具数量  一次购买数量
     */
    private Integer groupnum;
    /**
     * 货币类型  0：人民币 18：点券 28：绑定点券 116：商城积分
     */
    private Integer moneytype;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 限购类型  0：不限购 1：刷新限购 2：不刷新限购
     */
    private Integer limittype;
    /**
     * 限购数量
     */
    private Integer limitnum;
    /**
     * 排序序号
     */
    private Integer sort;
    /**
     * 商品类型  0：普通商品 1：每日刷新 2：角色激活限制一次
     */
    private Integer goodsType;
    /**
     * 玩家等级限制（不够不展示）
     */
    private Integer playerLevelLimit;
    /**
     * 图标
     */
    private String icon;
    /**
     * 颜色CL_NONE:0:没有WHITE:1:白BLUE:2:蓝PURPLE:3:紫GREEN:5:绿PINK:5:粉YELLOW:6:橙 （品级为5暂时不要用）
     */
    private Integer color;
    /**
     * 剧情描述
     */
    private String description;
    private Integer buycount;
}
