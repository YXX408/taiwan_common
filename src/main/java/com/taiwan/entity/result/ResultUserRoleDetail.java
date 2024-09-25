package com.taiwan.entity.result;

import lombok.Data;

import java.util.Date;

@Data
public class ResultUserRoleDetail {
    private Integer role_no;
    private String name;
    private Integer uid;
    private Integer uName;
    private Integer rid;
    private Integer exp;
    private Integer lv;
    private Long coins;
    private Long diamonds;
    private Integer bpSlot;
    private Integer ft;
    private Integer score;
    private String state;
    private String lastloginTime;
    private String creationTime;
    private String type;
}
