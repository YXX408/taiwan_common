package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class RoleInfo {
    /**
     * 名称
     */
    private String name;
    /**
     * 觉醒后职业名字
     */
    private String awakenJobName;
    /**
     * 职业属性 0:物理 1:魔法
     */
    private Integer jobAttribute;
    /**
     * 职业类型 基础职业：0 转职职业：1
     */
    private Integer jobType;
    /**
     * 前置职业
     */
    private Integer prejob;
    /**
     * 性别 Male:0:男 Female:1:女
     */
    private Integer sex;
    /**
     * 相反性别的职业id
     */
    private Integer oppositeSexJob;
    /**
     *    是否开放                   不开放： 0          开放：1      
     */
    private Integer open;
    /**
     * 对应的拍卖行 职业筛选
     */
    private Integer auctionJob;
    /**
     * 困难程度 简单：0-1 普通：2-3 困难：4
     */
    private Integer diffcult;
    /**
     * 连击系数
     */
    private Integer comboFactor;
    /**
     * 资源ID
     */
    private Integer mode;
    /**
     * 推荐属性
     */
    private String recProperty;
    /**
     * 推荐防具
     */
    private String recDefence;
    /**
     * 体重
     */
    private Integer weight;
    /**
     * Idle动作名
     */
    private String idleAniName;
    /**
     * walk动作名
     */
    private String walkAniName;
    /**
     * run动作名
     */
    private String runAniName;
    /**
     * dead动作名
     */
    private String deadAniName;
    /**
     * 角色阻挡包围盒半径 (1000)
     */
    private Integer defaultBoxRadius;
    /**
     * 默认击中特效
     */
    private String defaultHitEffect;
    /**
     * 默认击中音效ID （对应音效表）
     */
    private Integer defaultHitSFXID;
    /**
     * 默认武器Tag
     */
    private Integer defaultWeaponTag;
    /**
     * 默认武器类型
     */
    private Integer defaultWeaponType;
    /**
     * 默认武器模型
     */
    private String defaultWeaponPath;
    /**
     * 默认武器模型挂点
     */
    private String defaultWeaponLocator;
    /**
     * 按键配置路径
     */
    private String inputConfigPath;
    /**
     * 初始携带技能
     */
    private String initSkills;
    /**
     * 技能面板该职业显示技能行数
     */
    private Integer maxSkillPanelIndex;
    /**
     * 觉醒技能
     */
    private Integer awakenSkills;
    /**
     * 预转职技能
     */
    private Integer proJobSkills;
    /**
     * 预转职对话ID
     */
    private String preJobDialogID;
    /**
     * 职业属性ID
     */
    private Integer fightID;
    /**
     * 可转职业1
     */
    private String toJob;
    /**
     * 普攻ID
     */
    private Integer normalAttackID;
    /**
     * 吃鸡模式中的普攻ID
     */
    private Integer chijiNormalAttackID;
    /**
     * 跳跃中攻击ID
     */
    private Integer jumpAttackID;
    /**
     * 跑动攻击ID
     */
    private Integer runAttackID;
    /**
     * 跳跃攻击的次数
     */
    private Integer jumpAttackNum;
    /**
     * 自动战斗AI 攻击配置
     */
    private String aIConfig1;
    /**
     * 自动战斗AI 行走配置
     */
    private String aIConfig2;
    /**
     * 自动战斗AI EVENT配置
     */
    private String aIConfig3;
    /**
     * 自动战斗保持距离
     */
    private Integer aIKeepDistance;
    /**
     * 能否在创角时创建
     */
    private Integer canCreateRole;
    /**
     * 转职礼包
     */
    private Integer toJobGift;
    /**
     * 创角职业名图片
     */
    private String jobCreateName;
    /**
     * 职业形象
     */
    private String jobPortrayal;
    /**
     * 职业半身像
     */
    private String jobHalfBody;
    /**
     * 角色头像
     */
    private String jobHead;
    /**
     * 角色全身像
     */
    private String jobBody;
    /**
     * 职业名称图片
     */
    private String jobIcon;
    /**
     * 技能Icon
     */
    private String skillIcon;
    /**
     * 职业描述
     */
    private String jobDes;
    /**
     * 职业简单描述
     */
    private String jobSimpleDes;
    /**
     * 觉醒职业icon
     */
    private String awakeJobIcon;
    /**
     * 觉醒职业名称
     */
    private String awakeJobName;
    /**
     * 觉醒技能名称
     */
    private String awakeSkillName;
    /**
     * 角色展示配置文件路径
     */
    private String jobShowPath;
    /**
     * 首冲武器 （道具ID_强化等级）
     */
    private String firstPayWeapon;
    /**
     * 充值配置 (8301-600000006_1,600000007_8|8304-600000006_1,600000007_8)
     */
    private String payItems;
    /**
     * 依次是 攻击力，攻击范围，攻击距离，控制，辅助，速度 (值的范围是1-5)
     */
    private String abilityChart;
    /**
     * 选角时的视频
     */
    private String video;
    /**
     * 选角时的角色图片
     */
    private String jobImage;
    /**
     * 好友界面头像X偏移量
     */
    private Integer offSetXFriendInfo;
    /**
     * 推荐护甲类型 布甲4 皮甲5 轻甲6 锁甲7 板甲8
     */
    private Integer suitArmorType;
    /**
     * 时装推荐的icon路径
     */
    private String jobFashionImage;
    /**
     * 私人订制的职业时装推荐的底图路径
     */
    private String goodsRecommendBG;
    /**
     * 城镇雕像模型朝向
     */
    private Integer townStatueFace;
    /**
     * 选角时职业字体icon
     */
    private String job_xuanjue_zhiye;
    /**
     * 转职完成界面预览技能
     */
    private String changeFinishShowSkills;
    /**
     * 创角进入城镇时的Loading界面路径
     */
    private String loadingPrefab;
    /**
     * PK匹配的职业半身像的预制体路径
     */
    private String pKMatchShowPrefab;
    /**
     * PK匹配的职业的结算半身像路径
     */
    private String pKResultPrefab;
    /**
     * PK结果头像路径
     */
    private String pKMatchResultHeadIconPath;
    /**
     * 转职任务提示图路径
     */
    private String changJobTaskPrompt;
    /**
     * 预约角色描述
     */
    private Integer appointmentRoleID;
    /**
     * 职业排序
     */
    private Integer jobSort;
    /**
     * 职业形象位置X
     */
    private Integer jobPortrayalPosX;
    /**
     * 职业形象位置Y
     */
    private Integer jobPortrayalPosY;
    /**
     * 首冲道具模型变换参数(r,x,y,z)       
     */
    private String firstPayModelTransform;
    /**
     * 时装合成推荐购买的时装的 商城道具表id
     */
    private Integer fashionMergeFastBuyID;
    /**
     * 转职任务提示图中转职预览按钮位置
     */
    private String changJobPromptButtonPos;
    /**
     * 推荐追求属性
     */
    private String recommendedAttribute;
    /**
     * 推荐属性的下标 1.生命 2.魔力 3.力量 4.智力 5.体力 6.精神 7.物理攻击 8.魔法攻击 9.物理防御 10.魔法防御 11.物暴 12.魔暴 13.攻速 14.施法速度 15.移动速度 16.侵蚀抗性 17.命中 18.闪避 19.生命恢复量 20.魔力恢复量 21.僵值 22.硬值 23.光属性强化 24.火属性强化 25.冰属性强化 26.暗属性强化 27.光属性抗性 28.火属性抗性 29.冰属性抗性 30.暗属性抗性
     */
    private String recommendedAttributeIndex;
    /**
     * 角色附加怪物对应的模型ID
     */
    private Integer attachMonsterResID;
    /**
     * 佣兵团角色收藏 小职业像路径
     */
    private String characterCollectionPhoto;
    /**
     * 佣兵团角色收藏 小职业名美术字路径
     */
    private String characterCollectionArtLetting;
    /**
     * 预约职业半身像图片
     */
    private String appointmentJobImage;
    /**
     * 大职业排序
     */
    private Integer baseJobSort;
    /**
     * 公平竞技场总技能点数
     */
    private Integer equalPvPSP;
    /**
     * 职业高度
     */
    private Integer height;
    /**
     * 吃鸡职业
     */
    private Integer chiJiOccu;

}