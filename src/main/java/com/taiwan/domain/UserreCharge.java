package com.taiwan.domain;

import lombok.Data;

@Data
public class UserreCharge {
    private Integer rechargeId;
    private Integer mallItemId;
    private Integer limittype;
    private Integer buycount;
    private Integer goodsType;
    private Integer role_no;
    private Integer mallType;
}
