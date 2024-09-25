package com.taiwan.entity.result;

import com.taiwan.entity.NameValue;
import lombok.Data;

import java.lang.reflect.Field;
import java.math.BigDecimal;

@Data
public class ResultAttr {
    /**
     * 基础力量
     */
    private NameValue power = new NameValue("力量");
    /**
     * 基础智力
     */
    private NameValue intellect = new NameValue("智力");
    /**
     * 基础体力
     */
    private NameValue streangth = new NameValue("体力");
    /**
     * 基础精神
     */
    private NameValue spirit = new NameValue("精神");
    /**
     * 基础最大HP
     */
    private NameValue hP = new NameValue("最大HP");
    /**
     * 基础最大MP
     */
    private NameValue mP = new NameValue("最大MP");
    /**
     * 基础HP回复
     */
    private NameValue hPRecover = new NameValue("HP回复");
    /**
     * 基础MP回复
     */
    private NameValue mPRecover = new NameValue("MP回复");
    /**
     * 基础物理攻击
     */
    private NameValue physicAttack = new NameValue("物理攻击");
    /**
     * 基础魔法攻击
     */
    private NameValue magicAttack = new NameValue("魔法攻击");
    /**
     * 基础物理防御
     */
    private NameValue physicDefence = new NameValue("物理防御");
    /**
     * 基础魔法防御
     */
    private NameValue magicDefence = new NameValue("魔法防御");
    /**
     * 基础攻击速度(1000)
     */
    private NameValue attackSpeed = new NameValue("攻击速度");
    /**
     * 基础施法速度
     */
    private NameValue spellSpeed = new NameValue("施法速度");
    /**
     * 基础移动速度(1000)
     */
    private NameValue moveSpeed = new NameValue("移动速度");
    /**
     * 基础物理暴击
     */
    private NameValue physicalCritical = new NameValue("物理暴击");
    /**
     * 基础魔法暴击
     */
    private NameValue magicCritical = new NameValue("魔法暴击");
    /**
     * 基础命中
     */
    private NameValue hitRate = new NameValue("命中");
    /**
     * 基础闪避
     */
    private NameValue missRate = new NameValue("闪避");
    /**
     * 基础僵直
     */
    private NameValue starkValue = new NameValue("僵直");
    /**
     * 基础硬直
     */
    private NameValue hardValue = new NameValue("硬直");
    /**
     * 光属强
     */
    private NameValue lightAttack = new NameValue("光属强");
    /**
     * 火属强
     */
    private NameValue fireAttack = new NameValue("火属强");
    /**
     * 冰属强
     */
    private NameValue iceAttack = new NameValue("冰属强");
    /**
     * 暗属强
     */
    private NameValue darkAttack = new NameValue("暗属强");
    /**
     * 光属抗
     */
    private NameValue lightDefence = new NameValue("光属抗");
    /**
     * 火属抗
     */
    private NameValue fireDefence = new NameValue("火属抗");
    /**
     * 冰属抗
     */
    private NameValue iceDefence = new NameValue("冰属抗");
    /**
     * 暗属抗
     */
    private NameValue darkDefence = new NameValue("暗属抗");
    /**
     * 基础冷却缩减
     */
    private NameValue cold = new NameValue("冷却缩减");
    private NameValue score = new NameValue("评分");

}
