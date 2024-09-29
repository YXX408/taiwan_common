package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Mission {
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务整数参数0
     */
    private Integer intParam0;
    /**
     * 排序ID
     */
    private Integer sortID;
    /**
     * 任务类别 TT_DIALY:0:每日 TT_MAIN:1:主线 TT_BRANCH:2:支线 TT_ACHIEVEMENT:3:成就 TT_SYSTEM:4:系统 TT_ACTIVITY:5:活动 TT_EXTENTION:6:外传 TT_CHANGEJOB:7:转职 TT_AWAKEN:8:觉醒 TT_CYCLE:9:循环任务 TT_RED_PACKET:10:红包任务 TT_TITLE:11:称号任务 TT_LEGEND:12:传奇之路 TASK_MASTER_DAILY :13:师门日常任务 TASK_MASTER_ACADEMIC:14:师门学业成长任务 TASK_ACCOUNT_ACHIEVEMENT:15:账号成就 TASK_ADVENTURE_TEAM_ACCOUNT_WEEKLY:16:佣兵团账号每周任务 ATTRIBUTE_GROWTH:17:属性成长任务
     */
    private Integer taskType;
    /**
     * 组队任务
     */
    private Integer team;
    /**
     * 日常随机池类型 DAILY_INVALID:0:无效 DAILY_SURE:1:必出 DAILY_DUNGEON:2:地下城 DAILY_FUNCTION:3:功能 DAILY_ACTIVITY:4:活动
     */
    private Integer dailyPoolType;
    /**
     * 随机池编号
     */
    private Integer poolID;
    /**
     * 关卡内任务类型 NPC_NONE:0:无 NPC_PROTECT:1:NPC护送 NPC_FIND:2:寻找NPC
     */
    private Integer taskLevelType;
    /**
     * 任务描述
     */
    private String taskInformationText;
    /**
     * 初始化任务文本
     */
    private String taskInitText;
    /**
     * 进行中任务文本
     */
    private String taskAcceptedText;
    /**
     * 完成条件文本
     */
    private String taskFinishText;
    /**
     * 所属地下城
     */
    private Integer mapID;
    /**
     * 寻路目标
     */
    private Integer seekingTarget;
    /**
     * 未接取任务对话ID
     */
    private Integer befTaskDlgID;
    /**
     * 进行 任务对话ID
     */
    private Integer inTaskDlgID;
    /**
     * 已完成任务对话ID
     */
    private Integer aftTaskDlgID;
    /**
     * 前置任务ID
     */
    private Integer preTaskID;
    /**
     * 服务器接取:0否;1是
     */
    private Integer severTake;
    /**
     * 最大玩家等级
     */
    private Integer maxPlayerLv;
    /**
     * 最小玩家等级
     */
    private Integer minPlayerLv;
    /**
     * 需求职业:对应职业表ID,0为全职业
     */
    private Integer jobID;
    /**
     * 任务完成条件 TFT_KILL:0:杀怪 TFT_PASS:1:通关地下城 TFT_COLLECT:2:收集 TFT_TALK:3:对话 TFT_KILL_BY_TYPE:4:杀某种类型 TFT_FINISHMISSION_TYPE:5:完成其他任务 TFT_ACCESS_SHOP:6:访问商店 TFT_SUBMIT_ITEM:7:提交物品                                                TFT_LINKS:8:链接                                         TFT_ONHOOK:9:挂机 TFT_ATTRIBUTEARRIVAL:10:属性达标
     */
    private Integer taskFinishType;
    /**
     * 任务完成链接
     */
    private String linkInfo;
    /**
     * 是否需要关闭原界面
     */
    private Integer linkParam;
    /**
     * 职业任务奖励(物品ID) (职业ID_id_num,职业ID_id_num,...） 装备填法有2种： 1.（职业ID_id_num,职业ID_id_num,...） 2.（职业ID_id_num_装备类型_参数,职业ID_id_num_装备类型_参数,…） 装备类型：0普通装备，1气息装备；参数：普通装备填强化等级，气息装备填0
     */
    private String occuAward;
    /**
     * 任务所需道具（仅收集任务与提交任务需要）
     */
    private String demand;
    /**
     * 任务奖励(物品ID) 1. 斗龙勇士任务  称号奖励必须放在最后 （id_num,id_num,...） 装备填法有2种： 1.（id_num,id_num,...） 2.（id_num_装备类型_参数,id_num_装备类型_参数,…） 装备类型：0普通装备，1气息装备；参数：普通装备填强化等级，气息装备填0
     */
    private String award;
    /**
     * 奖励适配
     */
    private Integer rewardAdapter;
    /**
     * 后置任务ID
     */
    private Integer afterID;
    /**
     * 任务图标
     */
    private String icon;
    /**
     * 接取类型: ACT_AUTO:0:自动接取 ACT_NPC:1:NPC接取 ACT_UI:2:界面接取
     */
    private Integer acceptType;
    /**
     * 提交类型: FINISH_TYPE_AUTO:0:自动提交 FINISH_TYPE_NPC:1:NPC FINISH_TYPE_UI:2:界面提交
     */
    private Integer finishType;
    /**
     * 任务所属NPC
     */
    private Integer missionTakeNpc;
    /**
     * 提交npc
     */
    private Integer missionFinishNpc;
    /**
     * 任务NPC小头像
     */
    private String missionNpcIcon;
    /**
     * 是否公告 不公告:0 公告:1
     */
    private Integer isAnnouncement;
    /**
     * 提交次数
     */
    private Integer maxSubmitCount;
    /**
     * 活力值
     */
    private Integer vitalityValue;
    /**
     * 任务参数 1. 觉醒任务，此处填1则意思为1觉 2.佣兵团周常任务，此处为难度级别 (C->0; B->1; A->2; S->3; SS->4; SSS->5)
     */
    private String missionParam;
    /**
     * 模板ID
     */
    private Integer templateId;
    /**
     * 脚本参数
     */
    private String scriptParam;
    /**
     * 任务开关 开:1 关:0
     */
    private Integer missionOnOff;
    /**
     * 任务怪指示ID （可以填多个用|分割，不填写0)
     */
    private String monsterIDs;
    /**
     * 任务所需材料 仅给传奇之路客户端显示
     */
    private String missionMaterials;
    /**
     * 任务所需材料键值对 仅给传奇之路客户端显示
     */
    private String missionMaterialsKeyValue;
    /**
     * 任务所需前置任务 仅给传奇之路客户端显示
     */
    private Integer preIDs;
    /**
     * 任务所需前置任务 仅给传奇之路客户端显示
     */
    private String preIDsConditionDesc;
    /**
     * 是否需要数据埋点
     */
    private Boolean isNeedBuriedPoint;
    /**
     * 宝箱任务对应的地下城id
     */
    private Integer dungeonTableID;
    /**
     * 立即完成所需等级
     */
    private Integer finishRightNowLevel;
    /**
     * 立即完成所需道具id
     */
    private Integer finishRightNowItemType;
    /**
     * 立即完成所需道具数量
     */
    private Integer finishRightNowItemNum;
    /**
     * 挂机场景
     */
    private String onHookScenario;
    /**
     * 需求数值类型
     */
    private Integer attributeType;
    /**
     * 需求数值
     */
    private Integer attributeValue;

}