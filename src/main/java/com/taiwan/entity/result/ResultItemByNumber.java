package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultItemByNumber {
    private Integer id;
    private Integer number;
    private Integer ownNumber;
    private String icon;
    private String name;
    private Integer color;
}
