package com.taiwan.domain;

import lombok.Data;

@Data
public class OrderCardMapping {
    private Integer mappingId;
    private Integer orderId;
    private String code;
    private Integer cardID;
    private String number;
}
