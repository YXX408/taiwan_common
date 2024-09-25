package com.taiwan.entity.result;

import com.taiwan.domain.OrderCard;
import lombok.Data;

import java.util.List;

@Data
public class ResultOrderMk2 {
    private Integer orderId;
    private Integer role_no;
    private String name;
    private Double total_price;
    private String activationTime;
    private Integer status;
    private List<OrderCard> orderCards;
}
