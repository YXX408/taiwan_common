package com.taiwan.domain;

import lombok.Data;

@Data
public class OnlyCdkPrice {
    private Integer cdkPriceId;
    private Integer onlyCdkId;
    private String item;
    private Integer num;
    private Integer buyerId;
}
