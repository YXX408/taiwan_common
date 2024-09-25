package com.taiwan.entity.result;

import com.taiwan.domain.basic.Buff;
import lombok.Data;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

@Data
public class ResultUserRoleProps {
    private Boolean isRole;
    private Integer role_no;
    private String roleName;
    private String avatar;
    private Integer nowExp;
    private Integer upgradeExp;
    private Integer lv;
    private Integer elements;
    private Integer rid;
    /**
     * 名称
     */
    private String name;
    /**
     * 基础力量
     */
    private float power;
    /**
     * 基础智力
     */
    private float intellect;
    /**
     * 基础体力
     */
    private float streangth;
    /**
     * 基础精神
     */
    private float spirit;
    /**
     * 基础最大HP
     */
    private float hP;
    /**
     * 基础最大MP
     */
    private float mP;
    /**
     * 基础HP回复
     */
    private float hPRecover;
    /**
     * 基础MP回复
     */
    private float mPRecover;
    /**
     * 基础物理攻击
     */
    private float physicAttack;
    /**
     * 基础魔法攻击
     */
    private float magicAttack;
    /**
     * 基础物理防御
     */
    private float physicDefence;
    /**
     * 基础魔法防御
     */
    private float magicDefence;
    /**
     * 基础攻击速度(1000)
     */
    private float attackSpeed;
    /**
     * 基础施法速度
     */
    private float spellSpeed;
    /**
     * 基础移动速度(1000)
     */
    private float moveSpeed;
    /**
     * 基础物理暴击
     */
    private float physicalCritical;
    /**
     * 基础魔法暴击
     */
    private float magicCritical;
    /**
     * 基础命中
     */
    private float hitRate;
    /**
     * 基础闪避
     */
    private float missRate;
    /**
     * 基础僵直
     */
    private float starkValue;
    /**
     * 基础硬直
     */
    private float hardValue;
    /**
     * 光属强
     */
    private float lightAttack;
    /**
     * 火属强
     */
    private float fireAttack;
    /**
     * 冰属强
     */
    private float iceAttack;
    /**
     * 暗属强
     */
    private float darkAttack;
    /**
     * 光属抗
     */
    private float lightDefence;
    /**
     * 火属抗
     */
    private float fireDefence;
    /**
     * 冰属抗
     */
    private float iceDefence;
    /**
     * 暗属抗
     */
    private float darkDefence;
    /**
     * 基础冷却缩减
     */
    private float cold;
    private Integer score;
    private HashMap<String,ResultBuffInfo> buffHashMap;
    // 通用的格式化方法
    private float formatFloat(float value) {
        return new BigDecimal(Float.toString(value)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    // 使用反射在对象初始化时自动格式化所有 float 属性
    {
        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == Float.TYPE) {
                try {
                    field.setAccessible(true);
                    float value = field.getFloat(this);
                    field.set(this, formatFloat(value));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
