package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class Decompose {
    /**
     * 颜色WHITE:1:白BLUE:2:蓝PURPLE:3:紫GREEN:4:传承PINK:5:粉YELLOW:6:橙
     */
    private Integer color;
    /**
     * 颜色1:灰色25,:白色3:玫红
     */
    private Integer color2;
    /**
     * 装备LV
     */
    private Integer lv;
    /**
     * 有色材料数量
     */
    private String colorMatNum;
    /**
     * 有色材料ID
     */
    private Integer colorMatId;
    /**
     * 无色材料数量
     */
    private String colorLessMatNum;
    /**
     * 无色材料ID
     */
    private Integer colorLessMatId;
    /**
     * 宇宙之眼(橙装)
     */
    private String dogEyeNum;
    /**
     * 橙装得到材料ID
     */
    private Integer dogEyeId;
    /**
     * 异界材料(异界装备)
     */
    private String magicItemNum;
    /**
     * 异界装备得到材料ID
     */
    private Integer magicItemId;
    /**
     * 特殊材料数量
     */
    private String pinkItemNum;
    /**
     * 特殊得到材料ID
     */
    private Integer pinkItemId;
    /**
     * 异界气息装备掉落数量
     */
    private String redItemNum;
    /**
     * 异界气息装备掉落ID
     */
    private Integer redItemId;

}