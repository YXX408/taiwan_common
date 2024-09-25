package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserItmForAll {
    private Integer item_no;
    private Integer item_id;
    private Integer id;
    private String name;
    private Integer type;
    private Integer number;
    private Integer isBank;
    private Integer color;
    private Integer isWear;//是否穿戴
    private Integer beadId;//宝珠镶嵌
    private Integer enhLv;//增幅等级
    private Integer ePrompt;
}
