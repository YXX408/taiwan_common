package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class EnhanceTicket {
    /**
     * 概率(1000 = 1)
     */
    private Integer probility;
    /**
     * 增幅等级
     */
    private Integer level;
    /**
     * 描述
     */
    private String desc;
    /**
     * 是否增幅券合成产出  0不是 1是
     */
    private Integer compound;
    /**
     * 增幅价值
     */
    private Integer fuseValue;

}