package com.taiwan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class CdkLog {
    private Integer clId;
    private Integer role_no;
    private Integer cdkId;
    private String type;
    private Date cdkLogTime;
}
