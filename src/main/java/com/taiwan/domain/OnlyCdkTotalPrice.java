package com.taiwan.domain;

import lombok.Data;

@Data
public class OnlyCdkTotalPrice {
    private Integer cdkTotalPriceId;
    private String cdkList;
    private String item;
    private Integer num;
    private Integer buyerID;
}
