package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoomUser implements Serializable {
    private static final long serialVersionUID = 123456789L; // 使用你自己的值
    private Boolean isOwner;//是否为房主
    private Boolean status; // 加载状态
    private Integer nextMapNum;
    private Boolean isAlive = true;
}
