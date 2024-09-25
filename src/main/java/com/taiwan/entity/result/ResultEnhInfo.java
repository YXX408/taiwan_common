package com.taiwan.entity.result;


import lombok.Data;

import java.util.List;

@Data
public class ResultEnhInfo {
    private Double sucRate;
    private List<Integer> attribute;
    private Integer lv;
    private Long coins;
    private Boolean isCoins;
    private Boolean isItem;
    private List<ResultItem> items;
    private List<Integer> userItemNumber;
}
