package com.taiwan.domain;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Integer id;
    private Double total_price;
    private String goods_name;
    private Integer status;
    private Long success_at;
    private List<OrderCard> orderCards;
}
