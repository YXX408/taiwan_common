package com.taiwan.entity.result;


import lombok.Data;

import java.util.List;

@Data
public class ResultEnh {
    private Integer lv;
    private float attribute;
    private Integer fail;
    private List<ResultItem> resultUserItems;
}
