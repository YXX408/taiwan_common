package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultEqForge {
    private Long coins;
    private List<ResultItemByNumber> eq;
    private List<ResultItemByNumber> item;
    private Boolean isItem;
    private Boolean isCoins;
    private Long myCoins;
}
