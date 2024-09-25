package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class GiftPack {
    /**
     * 礼包名字：notexport
     */
    private String nouse1;
    /**
     * 筛选类型 None:0:无 Job:1:根据职业筛选 Random:2:随机获得N件 Custom:3:自定义选择N件 CustomWithJob:4:在职业符合的道具中，自定义选择N件
     */
    private Integer filterType;
    /**
     * 过滤出的礼品数量 -1：没有限制 0：无法获得 >0：获得指定数量礼品
     */
    private Integer filterCount;
    /**
     * 礼品ID集合
     */
    private String items;
    /**
     * 开礼包的界面类型 0：普通界面 1：特殊界面
     */
    private Integer uIType;
    /**
     * 筛选类型 None:0:不可预览 Single:1:单一预览 Complete:2:整套预览 Enumeration:3:分开预览 Combination:4:组合预览 Matching:5:组合和宠物预览 CompleteEnumeration:6:礼包整套分开预览
     */
    private Integer showAvatarModelType;

}