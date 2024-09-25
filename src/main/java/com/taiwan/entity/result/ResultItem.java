package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultItem {
    private Integer id;
    private Integer number;
    private String icon;
    private String name;
    private Integer color;
    private Integer isTransaction;
    private Integer price;

}
