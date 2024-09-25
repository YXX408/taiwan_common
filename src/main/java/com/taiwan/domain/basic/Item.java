package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Item {
    /**
     * 名称
     */
    private String name;
    /**
     * 排序列称号：1~1000
     */
    private Integer idSequence;
    /**
     * 类别EQUIP:1:装备EXPENDABLE:2:消耗MATERIAL:3:材料TASK:4:任务FASHION:5:装扮INCOME:6:收益ENERGY:7:能量石FUCKTITTLE:8:称号系统VirtualPack:9:虚拟礼包PET:10:宠物HEAD_FRAME:12:头像框ITEM_NEWTITLE:14:头衔SKILL_CHIJI:13:吃鸡技能ITEM_INSCRIPTION:15:铭文ITEM_MONOPOLY_CARD:17:大富翁卡牌
     */
    private Integer type;
    /**
     * 类别名称
     */
    private String typeName;
    /**
     * 是否提示使用EPT_NONE:0:否EPT_NEW_EQUIP:1:新装备EPT_RED_POINT:2:红点
     */
    private Integer ePrompt;
    /**
     * 子类别ST_NONE:0:无WEAPON:1:武器HEAD:2:头部CHEST:3:胸BELT:4:腰带LEG:5:护腿BOOT:6:鞋子RING:7:戒指NECKLASE:8:项链BRACELET:9:手镯TITLE:10:称号FASHION_HAIR:11:时装光环FASHION_HEAD:12:时装头饰（头部）FASHION_SASH:13:时装腰饰（手饰）FASHION_CHEST:14:时装上装FASHION_LEG:15:时装下装FASHION_EPAULET:16:时装胸饰（头饰）GOLD:17:金币POINT:18:点券EXP:19:经验DRUG:20:药品WARRIOR_SOUL:22:勇者之魂DUEL_COIN:23:斗兽币MATERIAL_JINGPO:24:精魄EnchantmentsCard:25:附魔卡ResurrectionCcurrency:26:复活币BindGOLD:27:绑定金币BindPOINT:28:绑定点券GiftPackage:29:礼包GuildContri:30:公会贡献SP:31:技能点EnergyStone:32:能量石Coupon:33:强化券MonthCard:34:月卡Jar:35:随机罐子GiftBox:36:礼盒（带预览）FatigueDrug:37:疲劳药Drawing:38:图纸残卷Fragment:39:碎片VipExp:40:VIP经验ExperiencePill:41:经验丸GoldJarPoint:42:金罐积分MagicJarPoint:43:魔罐积分PetEgg:44:宠物蛋ST_FASHION_COMPOSER:45:时装合成器MoneyManageCard:46:理财卡Hp:50:hp药水Mp:51:mp药水HpMp:52:hp+mp药水ChangeName:53:改名卡Bead:54:宝珠MagicBox:55:魔盒MagicHammer:56:魔锤Param:57:无色晶体ST_JAR_GIFT:58:魔罐规则的礼包ChargeActivityScore:60:充值活动积分ST_ADD_VIP_POINT:61:补VIP积分AttributeDrug:62:属性药水ST_APPOINTMENT_COIN:70:预约币LOTTERY_COIN:71:抽奖币Perfect_washing:72:完美洗炼卷ST_CONSUME_JAR_GIFT:73:开启需要消耗道具的魔罐规则的礼包ST_PRIMARY_RAFFLE_TICKETS:74:初级抽奖券ST_MIDDLE_RAFFLE_TICKETS:75:中级抽奖券ST_SENIOR_RAFFLE_TICKETS:76:高级抽奖券ST_MASTER_ACADEMIC_VALUE:78:师门学业成长值ST_MASTER_GOODTEACH_VALUE:79:良师值ST_RETURN_TOKEN:80:回归硬币FASHION_WEAPON:81:时装武器ST_CHANGE_FASHION_ACTIVE_TICKET:82:换装券ST_DRESS_INTEGRAL_VALUE:83:换装积分ST_WEAPON_LEASE_TICKET:84:好运符ST_EXTENSIBLE_ROLE_CARD:85:角色栏扩展卡ST_UP_LEVEL_BOOK:86:升级书ST_BLESS_CRYSTAL_VALUE:87:赐福水晶ST_INHERIT_BLESS_VALUE:88:传承祝福ST_PEARL_HAMMER:89:金刚锤ST_DIAMOND_HAMMER:90:钻石锤ST_GOLD_REWARD_VALUE:91:赏金FASHION_AURAS:92:时装光环DiscountCoupon:93:折扣劵ST_NEW_TITLE:94:头衔道具ChijiHp:95:吃鸡hp药水ChijiMoveSpeed:96:吃鸡移速药水ChijiGrenade:97:吃鸡手雷ChijiBuff:98:吃鸡BuffST_ASSIST_EQUIP:99:辅助装备ST_MAGICSTONE_EQUIP:100:魔法石ST_EARRINGS_EQUIP:101:耳环ST_ZENGFU_MATERIAL:102:增幅消耗材料ST_ZENGFU_ACTIVATE:103:虚空物质激活装置ST_ZENGFU_CLEANUP:104:虚空物质清除装置ST_ZENGFU_CHANGE:105:虚空物质转换器ST_ZENGFU_CREATE:106:虚空物质生成装置ST_ZENGFU_OVERLOAD:107:虚空物质过载装置ST_ZENGFU_PROTECT:108:增幅保护券ST_ZENGFU_AMPLIFICATION:109:增幅券ST_CHIJI_TRAP:110:陷阱ST_ACHIEVEMENT_POINT:111:成就点ST_CHI_JI_COIN:112:吃鸡荣耀币ST_STRENGTHEN_PROTECT:113:强化保护券ST_ZJSL_WZHJJJ_COIN:114:终极试炼王者华戒ST_ZJSL_WZHGGG_COIN:115:终极试炼王者华冠ST_MALL_POINT:116:商城积分ST_INSCRIPTION:117:铭文ST_FLYUPITEM:118:飞升道具ST_ADVENTURE_COIN:119:冒险币ST_VIRTUAL:120:虚拟道具ST_WANSHENGJIE_VIRTUAL:121:万圣节虚拟道具ST_ADVENTURE_PASS_EXP:123:冒险通行证经验ST_ADVENTURE_PASS_ACTIVATE_ITEM:124:王者版通行证激活券ST_FRIEND_PRESENT:125:好友赠送道具ST_HONOR_SCORE:126:荣誉值ST_SPRING_SCORE:127:春季挑战积分ST_CHIJI_SKILL:128:吃鸡技能ST_CHIJI_SHOP_COIN:129:吃鸡商店货币ST_HIRE_COIN:130:招募硬币ST_TEAM_COPY_CNT:131:普通团本通行证ST_HONOR_GUARD_CARD:132:荣誉保障卡ST_ADVENTURE_KING:133:冒险通行证王者版ST_TEAM_COPY_DIFF_CNT:140:噩梦团本通行证ST_MAGIC_DISCOUNT:142:魔罐折扣券ST_CHAMPION_COIN:145:冠军赛竞猜币ST_RANDOM_SHARPEN:146:随机增幅券ST_STRENTH_LUCK:147:幸运强化券ST_GIFT_RIGHT_CARD:149:礼遇特权卡ST_CREDIT_POINT:150:信用点券ST_DEEP_TICKET:151:深渊票(绑)ST_FANTASY_COIN:154:奇幻之旅币ST_MONOPOLY_CARD:155:大富翁随机卡ST_MONOPOLY_ROLL:156:大富翁骰子ST_SECRET_SELL_COIN:157:神秘卖场周年点券ST_MONOPOLY_BUFF:158:大富翁BUFFST_ANCIENT_TICKET:159:远古票(绑)ST_SORROW_MEMENTO:160:哀伤的记忆碎片（绑）ST_DEEP_CARD:161:深渊助力特权卡ST_NONE_IDK:162:皮肤
     */
    private Integer subType;
    /**
     * 子类别名称
     */
    private String subTypeName;
    /**
     * 三类别TT_NONE:0:无HUGESWORD:1:重剑KATANA:2:武士刀SHORTSWORD:3:轻剑BEAMSWORD:4:光刃BLUNT:5:钝器REVOLVER:6:手枪CROSSBOW:7:弩HANDCANNON:8:重机炮RIFLE:9:步枪PISTOL:10:手枪STAFF:11:法杖WAND:12:魔杖SPEAR:13:矛STICK:14:棍棒BESOM:15:扫把GLOVE:16:拳刃BIKAI:17:臂铠CLAW:18:爪OFG:19:拳套EAST_STICK:20:旋棍SICKLE:21:镰刀TOTEM:22:图腾AXE:23:战斧BEADS:24:念珠CROSS:25:十字架CLOTH:51:布甲SKIN:52:皮甲LIGHT:53:轻甲HEAVY:54:锁甲PLATE:55:板甲FASHION_JUNIOR:100:初级时装FASHION_SENIOR:101:高级时装FASHION_FESTIVAL:102:节庆时装COMPOSER_JUNIOR:103:初级时装合成器COMPOSER_SENIOR:104:高级时装合成器ZENGFU_COLOR_PURPLE:200:增幅道具针对紫色装备使用ZENGFU_COLOR_PINKUP:201:增幅道具对紫色及以上装备使用ZENGFU_COLOR_GREEN:202:增幅道具针对绿色装备使用DisposableStrengItem:203:一次性强化装置DisposableIncreaseItem:204:一次性增幅装置VoidCrackTicket:205:虚空裂缝门票SmallFatigueDrug:300:小疲劳药MiddleFatigueDrug:301:中疲劳药BigFatigueDrug:302:大疲劳药BatteDrug:401:战斗中可以使用的药品ChangePlayerName:500:玩家改名卡ChangeGuildName:501:公会改名卡GoldTitle:502:金币称号ChangeAdventureName:503:冒险队改名卡ExtensibleRoleCard:504:角色栏位扩展卡UpLevelBook:505:升级书IT_ITEM_CONVERTOR_SAME:506:同套装转换器IT_ITEM_CONVERTOR_DIFF:507:跨套装转换器GoddessTear:600:女神之泪LevelShow:601:等级段展示PowerGem:611:力量宝珠IntelligenceGem:612:智力宝珠LivesGem:613:体力宝珠SpiritGem:614:精神宝珠CritsGem:615:物暴宝珠MagicGem:616:魔暴宝珠PreciseGem:617:精准宝珠RapidlyGem:618:急速宝珠DischargeGem:619:吟唱宝珠ElementGem:620:元素宝珠SkillGem:621:技能宝珠FashionGift:622:时装礼包HaloGift:623:光环礼包UseToSelf:701:对自己使用UseToOther:702:对别人使用ChijiGiftPackage:703:吃鸡礼包ST_CHIJI_MIANZHAN:129:吃鸡免战RedInscription:800:红色铭文YellowInscription:801:黄色铭文BlueInscription:802:蓝色铭文DarkBlondInscription:803:暗金色铭文BrilliantGoldenInscription:804:耀金色铭文OrangeInscription:805:橙色铭文GreenInscription:806:绿色铭文VioletInscription:807:紫色铭文
     */
    private Integer thirdType;
    /**
     * 三类别名称
     */
    private String thirdTypeName;
    /**
     * 职业-1为只有转职后可用，-大职业为只有特定职业的转职可用
     */
    private String occu;
    /**
     * 职业筛选（商店标签）
     */
    private String occu2;
    /**
     * 颜色CL_NONE:0:没有WHITE:1:白BLUE:2:蓝PURPLE:3:紫GREEN:5:绿PINK:5:粉YELLOW:6:橙 （品级为5暂时不要用）
     */
    private Integer color;
    /**
     * 作用部位  ST_NONE:0:无 WEAPON:1:武器 HEAD:2:头部 CHEST:3:胸 BELT:4:腰带 LEG:5:护腿 BOOT:6:鞋子 RING:7:戒指 NECKLASE:8:项链 BRACELET:9:手镯 TITLE:10:称号 ST_ASSIST_EQUIP:99:辅助装备 ST_MAGICSTONE_EQUIP:100:魔法石 ST_EARRINGS_EQUIP:101:耳环
     */
    private String parts;
    /**
     * （用于飞升药水增加的等级）
     */
    private Integer color2;
    /**
     * 需要等级
     */
    private Integer needLevel;
    /**
     * 最大等级
     */
    private Integer maxLevel;
    /**
     * 基础攻击速度(千分比)（保留）
     */
    private Integer baseAttackSpeedRate;
    /**
     * 能否使用CanNot:0:不能使用UseOne:1:只能单个使用UseTotal:2:可以一键使用全部
     */
    private Integer canUse;
    /**
     * 能否交易（商店）不能交易的不能放进仓库
     */
    private Integer canTrade;
    /**
     * 归属NOTBIND:1:非绑定ROLEBIND:2:角色绑定ACCBIND:3:账号绑定
     */
    private Integer owner;
    /**
     * 是否封装
     */
    private Integer isSeal;
    /**
     * 封装上限
     */
    private Integer sealMax;
    /**
     * 是否可分解
     */
    private Integer isDecompose;
    /**
     * 出售获得的物品ID
     */
    private Integer sellItemID;
    /**
     * 价格
     */
    private String price;
    /**
     * 冷却时间组(共享cd)
     */
    private Integer cdGroup;
    /**
     * 冷却时间(S)
     */
    private String coolTime;
    /**
     * 剩余时间(S)
     */
    private Integer timeLeft;
    /**
     * 叠加数
     */
    private String maxNum;
    /**
     * 效果描述
     */
    private String effectDescription;
    /**
     * 剧情描述
     */
    private String description;
    /**
     * 来源链接
     */
    private String comeLink;
    /**
     * 同类消耗关联
     */
    private String relationID;
    /**
     * 图标
     */
    private String icon;
    /**
     * 模型路径现在暂时用图片，或许之后用模型呢
     */
    private String modelPath;
    /**
     * null
     */
    private String path2;
    /**
     * 使用附加buffID
     */
    private Integer onUseBuffId;
    /**
     * 获得附加buffID
     */
    private Integer onGetBuffId;
    /**
     * 能否单局使用
     */
    private Integer canDungeonUse;
    /**
     * 能否PK使用
     */
    private Integer canPKUse;
    /**
     * 推荐价格
     */
    private Integer recommendPrice;
    /**
     * 物品来源CT_SHOP:0:商店CT_MISSION:1:任务CT_ACTIVITY:2:活动
     */
    private Integer comeType;
    /**
     * 来源描述
     */
    private String comeDesc;
    /**
     * （武器、皮肤、称号、光环、宠物）资源路径
     */
    private String resID;
    /**
     * （武器、皮肤、称号、光环）资源Tag
     */
    private Integer tag;
    /**
     * 所属套装ID
     */
    private Integer suitID;
    /**
     * 装备属性ID
     */
    private Integer equipPropID;
    /**
     * 互斥buffID(buff1|buff2...)
     */
    private String mutexBuff;
    /**
     * 是否公告
     */
    private Integer canAnnounce;
    /**
     * 点击使用后跳转位置
     */
    private String linkInfo;
    /**
     * 是否直接跳转到物品链接
     */
    private Integer bNeedJump;
    /**
     * 关联的功能序号
     */
    private Integer functionID;
    /**
     * 使用限制类别NOLIMITE:0:无限制DAYLIMITE:1:日限制VIPLIMITE:2:vip限制TEAMCOPYLIMITE:3:团本道具HONORLV:4:荣誉等级SUITLV:5:适用套装等级WEEK6LIMITE:6:周限制
     */
    private Integer useLimiteType;
    /**
     * 使用限制值日限制填次数vip限制填vip表id荣誉等级填荣誉等级表等级适用套装等级填套装等级
     */
    private Integer useLimiteValue;
    /**
     * 是否废弃0.不废弃1.废弃
     */
    private Integer abandon;
    /**
     * 礼包表ID
     */
    private Integer packageID;
    /**
     * 称号薄ID
     */
    private Integer titleBookID;
    /**
     * 是否禁止拍卖行复制
     */
    private Integer forbidAuctionCopy;
    /**
     * 续费信息天数(0为永久),货币id,货币数量|...
     */
    private String renewInfo;
    /**
     * 拍卖行最低价格
     */
    private Integer auctionMinPrice;
    /**
     * 拍卖行最高价格
     */
    private Integer auctionMaxPrice;
    /**
     * 是否支持师徒赠送
     */
    private Integer canMasterGive;
    /**
     * 获得限制数量
     */
    private Integer getLimitNum;
    /**
     * 开启时对应消耗的道具Id和数量
     */
    private String jarGiftConsumeItem;
    /**
     * 使用时需要弹窗二次确认的描述，如果为空则不会有弹窗二次确认
     */
    private String doubleCheckDesc;
    /**
     * 是否透明时装
     */
    private Integer isTransparentFashion;
    /**
     * 镶嵌孔1
     */
    private String inlaidhole1;
    /**
     * 镶嵌孔2
     */
    private String inlaidhole2;
    /**
     * 强化券数据索引
     */
    private Integer strenTicketDataIndex;
    /**
     * 宝珠可升级等级
     */
    private Integer beadLevel;
    /**
     * 宝珠色彩PBMHT_COMMON:1:普通PBMHT_COLOUR:2:多彩
     */
    private Integer beadType;
    /**
     * 是否珍品
     */
    private Integer isTreas;
    /**
     * 交易冷却CD单位（小时）买量渠道
     */
    private Integer tradeCD1;
    /**
     * 交易冷却CD单位（小时）其他渠道
     */
    private Integer tradeCD2;
    /**
     * 强化券适用范围（对应装备等级）
     */
    private String lvAdaptation;
    /**
     * 剧情描述动态数据链接ID
     */
    private Integer descriptionLink;
    /**
     * 是否记录日志
     */
    private Integer isRecordLog;
    /**
     * 折扣券折扣率
     */
    private Integer discountCouponProp;
    /**
     * 头衔id
     */
    private Integer newTitleId;
    /**
     * 到期时间
     */
    private Integer expireTime;
    /**
     * 交易次数0或不填则认为没有交易次数限制
     */
    private Integer transactionsNum;
    /**
     * 装备禁止使用的功能IPOE_INVALE:0:无IPOE_STRENG:1:强化IPOE_UPGRADE:2:升级IPOE_ADDMAGIC:3:附魔IPOE_MOUNTBEAD:4:宝珠IPOE_DECOMPOSE:5:分解IPOE_ENHANCE:6:增幅IPOE_CLEARSMELL:7:清除气息IPOE_REDACTIVE:8:激活IPOE_REDCHAGE:9:转化
     */
    private String prohibitOps;
    /**
     * 可使用总次数
     */
    private Integer useLinmit;
    /**
     * 是否特殊附魔卡
     */
    private Integer isSpeicMagic;
    /**
     * 赠送后被赠送方获得的道具
     */
    private String presentItems;
    /**
     * 赠送数量限制给我赠送数量|我赠送的数量|被赠送数量
     */
    private String presentItemsLimit;
    /**
     * 装备评分
     */
    private Integer attachRateScore;

}