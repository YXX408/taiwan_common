package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class JarBonus {
    /**
     * 名称
     */
    private String name;
    /**
     * 类别，前100非活动，101后活动 NoneJar:0:缺省值 MagicJar:1:魔罐 MagicJar_Lv55:4:55级魔罐 GoldJar:2:金罐 BudoJar:3:武道大会罐子 EqrecoJar:5:装备回收罐子 WingJar:101:翅膀袖珍罐 FashionJar:102:时装袖珍罐 EquipJar:103:装备袖珍罐
     */
    private Integer type;
    /**
     * 筛选参数 格式 -> 条件1|条件2|……..  金罐 条件1：巨剑1，左轮2，法杖3，布甲4，皮甲5，轻甲6，锁甲7，板甲8，戒指9，项链10，手镯11 条件2：罐子等级 装备活动罐 条件1：罐子等级
     */
    private String filter;
    /**
     * 罐子图片路径
     */
    private String jarImage;
    /**
     * 罐子打开特效
     */
    private String jarEffect;
    /**
     * 开罐次数1(优先高) 魔盒的为第几次双倍
     */
    private Integer exBonusNum_1;
    /**
     * 奖励罐子ID1(优先高)
     */
    private Integer exBonusJarID_1;
    /**
     * 开罐次数2(优先低) 目前只能魔盒的第一次用（引导用）
     */
    private Integer exBonusNum_2;
    /**
     * 奖励罐子ID1(优先高) 目前只能魔盒的第一次用（引导用）
     */
    private Integer exBonusJarID_2;
    /**
     * 购买的道具数量  id,minNum,maxNum|id,minNum,maxNum...
     */
    private String getItemsAndNum;
    /**
     * 购买货币类别，不需要则不填  600000001:金币 600000002:点券 600000007:绑金 600000008:绑点 600000220:装备回收点
     */
    private Integer buyMoneyType;
    /**
     * 购买货币量，不需要则不填
     */
    private Integer moneyValue;
    /**
     * 每日购买次数限制
     */
    private Integer dayBuyLimite;
    /**
     * 每日购买次数计数key
     */
    private String buyLimitKey;
    /**
     * 是否需要凭证道具
     */
    private Integer needExItem;
    /**
     * 凭证道具ID 魔盒时为魔盒ID
     */
    private Integer exItemID;
    /**
     * 凭证道具消耗数量
     */
    private Integer exItemCostNum;
    /**
     * 连抽次数 魔盒时为每次开几个
     */
    private Integer comboBuyNum;
    /**
     * 单抽折扣
     */
    private Integer singleBuyDiscount;
    /**
     * 连抽折扣
     */
    private Integer comboBuyDiscount;
    /**
     * 开罐计数key 每个罐子新加一个数字 已有的罐子有重复的是bug，新加的罐子不要重复了
     */
    private String counterKey;
    /**
     * 开罐获得的积分id
     */
    private Integer getPointType;
    /**
     * 开罐获得的积分数量
     */
    private Integer getPointNum;
    /**
     * 开罐积分暴击 倍数,几率|倍数,几率...
     */
    private String getPointCrit;
    /**
     * 最大免费次数
     */
    private Integer maxFreeCount;
    /**
     * 免费CD（秒）
     */
    private Integer freeCD;
    /**
     * 罐子下一次免费使用次数key
     */
    private String freeNumCounterKey;
    /**
     * 罐子下一次使用免费时间key
     */
    private String nextFreeTimeCounterKey;
    /**
     * 是否需要记录(1:是, 0:否)
     */
    private Integer needRecord;
    /**
     * 活动罐子折扣最大次数(非活动罐子无效)
     */
    private Integer actJarDisMaxNum;
    /**
     * 活动罐子折扣是否重置(非活动罐子无效)
     */
    private Integer actJarDisReset;
    /**
     * 罐子派奖的人数
     */
    private Integer actifactJarRewardTime;
    /**
     * 罐子礼包必出物品次数
     */
    private Integer jarGiftMustOutNum;
    /**
     * 本次循环周期内是否出过珍惜物品key
     */
    private String curCycleIsOutTreasKey;
    /**
     * 罐子礼包累计必出替换罐子id
     */
    private Integer jarGiftOutJarId;
    /**
     * 产生气息装备的概率类型
     */
    private Integer smellType;

}