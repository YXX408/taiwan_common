package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class DungeonEntity implements Serializable {
    private static final long serialVersionUID = 123456789L; // 使用你自己的值
    private Integer health;
    private Position position;
}
