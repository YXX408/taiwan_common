package com.taiwan.entity.result;

import lombok.Data;

import java.util.Date;

@Data
public class ResultOnlyCdk {
    private Integer onlyCdkId;
    private Integer role_no;
    private String name;
    private String code;
    private String onlyName;
    private String items;
    private Date onlyCdkLogTime;
}
