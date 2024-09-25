package com.taiwan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserEq implements Serializable {
    private Integer eq_no;
    private Integer role_no;
    private Integer eqId;
    private Integer type;
    private Integer subType;
    private Integer enhLv;
    private Integer needLevel;
    private Integer isBank;
    private Integer isWear;
    private Integer ePrompt;
    private Integer color;
    private Integer beadId;
    private Integer isTransaction;
    public UserEq(){}
    public UserEq(Integer role_no,Integer isBank) {
        this.role_no = role_no;
        this.isBank = isBank;
    }
    public UserEq(Integer role_no,Integer eqId,Integer isBank,Integer isWear) {
        this.role_no = role_no;
        this.eqId = eqId;
        this.enhLv = 0;
        this.isBank = isBank;
        this.isWear = isWear;
    }
    public UserEq(Integer role_no,Integer type,Integer subType,Integer isBank,Integer isWear) {
        this.role_no = role_no;
        this.type = type;
        this.subType = subType;
        this.isBank = isBank;
        this.isWear = isWear;
    }

}
