package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserItem implements Serializable {
    private Integer item_no;
    private Integer role_no;
    private Integer itemId;
    private Integer type;
    private Integer number;
    private Integer isBank;
    private Integer ePrompt;
    private Integer color;
    private Integer isTransaction;
    public UserItem(){}
    public UserItem(Integer role_no,Integer isBank) {
        this.role_no = role_no;
        this.isBank = isBank;
    }
    public UserItem(Integer role_no,Integer itemId,Integer number,Integer isBank) {
        this.role_no = role_no;
        this.itemId = itemId;
        this.number = number;
        this.isBank = isBank;
    }
    public UserItem(Integer role_no,Integer type,Integer isBank) {
        this.role_no = role_no;
        this.type = type;
        this.isBank = isBank;
    }
}
