package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserItem {
    private Integer item_no;
    private Integer id;
    private String name;
    private Integer number;
    private String icon;
    private Integer color;
    private Integer ePrompt;
    private Integer isTransaction;
}
