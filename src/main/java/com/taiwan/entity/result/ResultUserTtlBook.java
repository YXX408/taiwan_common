package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserTtlBook {
    private Integer eq_no;
    private Integer id;
    private String name;
    private String icon;
    private Integer color;
    private Integer ePrompt;
    private String resID;
    private Boolean isWear = false;
    private Integer isTransaction;
}
