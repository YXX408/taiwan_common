package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class JarItemShowPool {
    /**
     * 罐子类型
     */
    private String nouse1;
    /**
     * 道具名字
     */
    private String nouse2;
    /**
     * 罐子类别
     */
    private Integer jarType;
    /**
     * 道具ID
     */
    private Integer itemID;
    /**
     * 数量
     */
    private Integer itemNum;
    /**
     * 哪些职业可以看到 0全部 其他填大职业
     */
    private String visible;

}