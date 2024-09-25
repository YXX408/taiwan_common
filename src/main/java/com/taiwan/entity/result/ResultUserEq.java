package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserEq {
    private Integer eq_no;
    private String name;
    private Integer id;
    private Integer enhLv;
    private Integer needLevel;
    private String icon;
    private Integer color;
    private Integer subType;
    private Integer ePrompt;
    private Integer beadId;
    private Boolean isWear;
    private Integer isTransaction;

}