package com.taiwan.domain;

import lombok.Data;

@Data
public class LeisureReward {
    private Long countdown;//上次退出时剩余的时间
    private Integer rewardCount;//领取了多少次奖励
    private Long requiredTime;//单次循环所需时间
    private Integer diamonds;//点卷数量
}
