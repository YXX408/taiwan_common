package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Position implements Serializable {
    private static final long serialVersionUID = 123456789L; // 使用你自己的值
    private Float x;
    private Float y;
    private Float z;
    public Position() {
    }
    public Position(Float x,Float y,Float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
