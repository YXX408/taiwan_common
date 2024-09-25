package com.taiwan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OrderInfoResult {
    private Integer orderId;
    private Integer role_no;
    private Double total_price;
    private Date activationTime;

}
