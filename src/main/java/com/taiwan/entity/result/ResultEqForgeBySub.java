package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultEqForgeBySub {
    private String subTypeName;
    private List<ResultItem> eqs;
}
