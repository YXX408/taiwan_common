package com.taiwan.entity.result;
import lombok.Data;

import java.util.List;

@Data
public class ResultTaskAward {
    private Long coins;
    private Long diamonds;
    private Integer exp;
    private List<ResultItem> items;
}
