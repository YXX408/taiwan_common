package com.taiwan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OrderInfo {
    private Integer orderId;
    private Integer role_no;
    private Double total_price;
    private Date activationTime;
    private String code;
}
