package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class SceneUserRole implements Serializable {
    private static final long serialVersionUID = 123456789L; // 使用你自己的值
    private Integer uid;
    private Integer role_no;
    private Integer lv;
    private String name;
    private String wpnResID;
    private String haloResID;
    private String skinResID;
    private String titleResID;
    private String petResID;
    private Position position;
    private Integer petId;
    private String avatar;
    private Integer rid;
    private Boolean isOnlin;
    public SceneUserRole() {
    }
}
