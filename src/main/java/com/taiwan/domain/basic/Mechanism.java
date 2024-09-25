package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Mechanism {
    /**
     * 机制描述
     */
    private String description;
    /**
     * 机制序号
     */
    private Integer index;
    /**
     * 是否可以移除标志 0:不改变取默认值 1:可以移除 2:不可以移除
     */
    private Integer removeFlag;
    /**
     * StringValueA描述
     */
    private String stringDescriptionA;
    /**
     * StringA值
     */
    private String stringValueA;
    /**
     * ValueA描述
     */
    private String descriptionA;
    /**
     * ValueA值
     */
    private String valueA;
    /**
     * ValueB描述
     */
    private String descriptionB;
    /**
     * ValueB值
     */
    private String valueB;
    /**
     * ValueC描述
     */
    private String descriptionC;
    /**
     * ValueC值
     */
    private String valueC;
    /**
     * ValueD描述
     */
    private String descriptionD;
    /**
     * ValueD值
     */
    private String valueD;
    /**
     * ValueE描述
     */
    private String descriptionE;
    /**
     * ValueE值
     */
    private String valueE;
    /**
     * ValueF描述
     */
    private String descriptionF;
    /**
     * ValueF值
     */
    private String valueF;
    /**
     * ValueG描述
     */
    private String descriptionG;
    /**
     * ValueG值
     */
    private String valueG;
    /**
     * ValueH描述
     */
    private String descriptionH;
    /**
     * ValueH值
     */
    private String valueH;

}