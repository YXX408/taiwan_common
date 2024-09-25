package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OnlyCdk implements Serializable {
    private Integer onlyCdkId;
    private Integer role_no;
    private String code;
    private String onlyName;
    private Integer isReceive;
    private Integer valid;
    private String items;
    private Date onlyCdkLogTime;
}
