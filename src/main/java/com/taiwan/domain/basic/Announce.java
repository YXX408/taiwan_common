package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Announce {
    /**
     * 公告内容
     */
    private String noticeText;
    /**
     * 间隔时间
     */
    private Integer interval;
    /**
     * 次数
     */
    private Integer times;
    /**
     * 优先级
     */
    private Integer priority;
    /**
     * 参数
     */
    private Integer parameter;
    /**
     * 特效
     */
    private String effect;
    /**
     * 频道
     */
    private Integer channel;

}