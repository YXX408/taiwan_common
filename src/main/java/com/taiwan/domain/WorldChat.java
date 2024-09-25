package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class WorldChat implements Serializable {
    private static final long serialVersionUID = 123456789L;
    private Integer role_no;
    private String name;
    private Integer lv;
    private String avatar;
    private String message;
    private Long time;
    private Integer isNavigation;
    private String cardList;
}
