package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultOrder {
    private Integer orderId;
    private Integer role_no;
    private String name;
    private Integer total_price;
    private String activationTime;
}
