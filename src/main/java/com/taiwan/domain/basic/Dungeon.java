package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Dungeon {
    /**
     * 名字
     */
    private String name;
    /**
     * 原命名
     */
    private String oldname;
    /**
     * 小个的缩略图路径
     */
    private String tumbPath;
    /**
     * 小个的缩略角色路径
     */
    private String tumbChPath;
    /**
     * 加载背景图片路径
     */
    private String loadingBgPath;
    /**
     * 描述
     */
    private String description;
    /**
     * 难度描述
     */
    private String hardDescription;
    /**
     * 最低等级（决定开放等级）
     */
    private Integer minLevel;
    /**
     * 地下城等级（决定怪物属性）
     */
    private Integer level;
    /**
     * 类型 L_NORMAL:0:普通地下城 L_STORY:1:剧情地下城 L_ACTIVITY:2:活动地下城 L_DEADTOWER:3:死亡之塔
     */
    private Integer type;
    /**
     * 子类型 S_NORMAL:0:普通地下城 S_YUANGU:1:远古地下城 S_NIUTOUGUAI:2:牛头怪乐园 S_NANBUXIGU:3:南部溪谷 S_SIWANGZHITA:4:死亡之塔 S_NEWBIEGUIDE:5:引导boss战斗 S_PK:6:pk战斗 S_JINBI:7:金币地下城 S_HELL:8:深渊 S_GUILDPK:9:公会PVP S_HELL_ENTRY:10:深渊入口 S_TEAM_BOSS:11:组队BOSS S_MONEYREWARDS_PVP:12:赏金联赛0PVP S_WUDAOHUI:13:武道会关卡 S_JUEWANGZHITA:14:绝望之塔 S_COMBOTRAINING:15:连招教学 S_CITYMONSTER:16:哥布林大王 S_DEVILDDOM:17:异界 S_GUILD_DUNGEON:18:公会副本 S_LIMIT_TIME_HELL:19:限时深渊 S_WEEK_HELL:20:周常深渊 S_WEEK_HELL_ENTRY:22:周常深渊入口 S_WEEK_HELL_PER:23:周常深渊前置关卡 S_FINALTEST_PVE:24:终极试炼 S_RAID_DUNGEON:25:团本 S_ANNIVERSARY_NORMAL:26:周年活动普通 S_ANNIVERSARY_HARD:27:周年活动深渊 S_TREASUREMAP:28:春节活动藏宝图副本 S_LIMIT_TIME__FREE_HELL:31:限时深渊（无消耗） S_PLAYGAME:32:活动小游戏
     */
    private Integer subType;
    /**
     * 第三类型 T_NORMAL:0:普通地下城 T_T_TEAM_ELITE:1:组队地下城 T_CHIJI_PK:2:吃鸡PK场景 T_RACECAR:3:赛车场景
     */
    private Integer threeType;
    /**
     * 是否有翻牌类型 None:0:无 Golden_Card:1:黄金翻牌 Yijie_Card:2:异界翻牌 Hundun_Card:3:周常深渊翻牌
     */
    private Integer cardType;
    /**
     * 难度 NORMAL:0:普通 RISK:1:冒险 WARRIOR:2:勇士 KING:3:王者
     */
    private Integer hard;
    /**
     * 地下城标签 （最大ID为31）  0:代表其他 1-9:代表第一章到第九章 20:30深渊 21:50深渊 22:55深渊 23:55周常 26:40远古 27:50远古 28:55远古 30:堕落深渊
     */
    private Integer tag;
    /**
     * 抗魔值
     */
    private Integer resistMagic;
    /**
     * 推荐等级
     */
    private String recommendLevel;
    /**
     * 关卡难度适配类型 NORMAL:0:怪物本身等级 DUNGEON:1:关卡等级 TEAM:2:队伍平均等级 CITYMONSTER:3:怪物攻城
     */
    private Integer hardAdaptType;
    /**
     * 最高难度适配等级
     */
    private Integer maxHardAdaptLevel;
    /**
     * 单条血量数值
     */
    private Integer singleBarValue;
    /**
     * 可能掉落
     */
    private String dropItems;
    /**
     * 深渊可能掉落
     */
    private Integer hellDropItems;
    /**
     * 剧情任务
     */
    private Integer storyTaskID;
    /**
     * 前置任务
     */
    private Integer preTaskID;
    /**
     * 剧情地下城列表
     */
    private Integer storyDungeonIDs;
    /**
     * 前置地下城ID列表 前置列表基本都是剧情地下城
     */
    private Integer preDungeonIDs;
    /**
     * 地下城加载地图配置文件路径
     */
    private String dungeonLoadingConfig;
    /**
     * 地下城配置文件路径 区域列表由地下城配置文件生成 服务器转出来的表格数据是AreaID列表 开始的AreaID 深渊的AreaID
     */
    private String dungeonConfig;
    /**
     * 经验根据等级适配 1：表示经验需要等级适配 0：表示经验不需要等级适配
     */
    private Integer isExpAdapt;
    /**
     * 经验奖励 前面标记是需要等级适配时，这列代表等级适配表ID
     */
    private Integer expReward;
    /**
     * 结算时间分值划分  单位秒，数据需要递减
     */
    private String timeSplitArg;
    /**
     * 复活次数分值划分  单位次数，数据需要递减
     */
    private String rebornSplitArg;
    /**
     * 被击分值划分  单位次数，数据需要递减
     */
    private String hitSplitArg;
    /**
     * 结算时间参数
     */
    private Integer timeArg;
    /**
     * 结算背击参数
     */
    private Integer backHitArg;
    /**
     * 普通掉落
     */
    private String normalMonsterDrop;
    /**
     * 精英掉落
     */
    private String eliteMonsterDrop;
    /**
     * BOSS掉落
     */
    private String bossMonsterDrop;
    /**
     * 关卡掉落
     */
    private String dungeonDrop;
    /**
     * 活动掉落
     */
    private Integer activityDrop;
    /**
     * 关卡首次掉落
     */
    private Integer dungeonFirstDrop;
    /**
     * 可破坏物掉落
     */
    private Integer destructionDrop;
    /**
     * 彩蛋掉落
     */
    private Integer easterEggDrop;
    /**
     * 任务掉落
     */
    private Integer taskDrop;
    /**
     * 公共掉落
     */
    private Integer rollDropId;
    /**
     * 每个区域消耗的疲劳
     */
    private Integer costFatiguePerArea;
    /**
     * 消耗门票
     */
    private Integer ticketID;
    /**
     * 消耗门票数量
     */
    private Integer ticketNum;
    /**
     * 深渊票数量
     */
    private Integer hellTicketNum;
    /**
     * 深渊任务
     */
    private Integer hellTask;
    /**
     * 深渊困难掉落
     */
    private String hellDrop1;
    /**
     * 深渊非常困难掉落
     */
    private Integer hellDrop2;
    /**
     * 深渊终极困难掉落
     */
    private Integer hellDrop3;
    /**
     * 深渊活动掉落
     */
    private Integer hellActivityDrop;
    /**
     * 复活数量限制  -1表示无限复活次数
     */
    private Integer rebornCount;
    /**
     * 总复活数量限制 0表示无限复活次数
     */
    private Integer totalRebornCount;
    /**
     * 背景音乐路径
     */
    private String bGMPath;
    /**
     * 深渊困难背景音乐路径
     */
    private String hellHardBGMPath;
    /**
     * 深渊非常困难背景音乐路径
     */
    private String hellDamnHardBGMPath;
    /**
     * 结算掉落基础倍率
     */
    private Integer raceEndDropBaseMulti;
    /**
     * 加倍结算掉落所需消耗
     */
    private String raceEndDropMultiCost;
    /**
     * 活动ID
     */
    private Integer activityID;
    /**
     * 每日次数
     */
    private Integer dailyMaxTime;
    /**
     * Buff药配置
     */
    private Integer buffDrugConfig;
    /**
     * 房间数
     */
    private Integer mostCostStamina;
    /**
     * 深渊等级分段值  需要根据这个等级把所有怪的等级设置成统一值
     */
    private Integer hellSplitLevel;
    /**
     * 深渊等级分段权重  权重
     */
    private Integer hellSplitLevelWeight;
    /**
     * 是否开启自动战斗 0:不开 1:开
     */
    private Integer openAutoFight;
    /**
     * 是否只有结算收益
     */
    private Integer onlyRaceEndProfit;
    /**
     * 是否有师徒经验加成
     */
    private Integer hasMasterExpAddition;
    /**
     * 关卡流程数据
     */
    private String dungeonLevelPath;
    /**
     * 引导任务
     */
    private String guideTasks;
    /**
     * 是否强制GC
     */
    private Boolean needForceGC;
    /**
     * 是否单人副本
     */
    private Integer isSingle;
    /**
     * 关卡次数结算方式： 0：代表开始进入地下城就扣次数 1：打完结算
     */
    private Integer onlyRaceEndSettlement;
    /**
     * 所属地下城入口
     */
    private Integer ownerEntryId;
    /**
     * 入口选中权重
     */
    private Integer weightEntry;
    /**
     * 关卡玩法说明
     */
    private String playingDescription;
    /**
     * 兑换商店入口
     */
    private String exchangeStoreEntrance;
    /**
     * 精英地下城前置解锁章节
     */
    private String eliteDungeonPrevChapter;
    /**
     * 限制通关时间（秒）
     */
    private Integer limitTime;

}