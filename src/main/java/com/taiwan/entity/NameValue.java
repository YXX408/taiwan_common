package com.taiwan.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NameValue {
    private String name;
    private float value;
    // 提供设置和获取中文名的方法
    public NameValue(String name) {
        this.name = name;
    }
    public NameValue(){}
    public void formatNumericValue(int decimalPlaces) {
        // Format the numeric value to specified decimal places
        this.value = new BigDecimal(Float.toString(this.value)).setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP).floatValue();
    }
}
