package com.taiwan.entity.result;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ResultRedeemCdk {
    private Integer failNumber;
    private List<ResultItem> itemInfos = new ArrayList<>();
    private long coins = 0;
    private long diamonds = 0;
}
