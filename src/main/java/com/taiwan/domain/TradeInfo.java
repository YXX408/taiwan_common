package com.taiwan.domain;

import lombok.Data;

@Data
public class TradeInfo {
    private Integer tradeId;
    private Integer seller;
    private Integer buyer;
    private Integer item_no;
    private Integer finish;
    private Long coins;
}
