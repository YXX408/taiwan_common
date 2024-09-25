package com.taiwan.merge;

import lombok.Data;

import java.util.Date;
@Data
public class MergeCdkLog {
    private Integer role_no;
    private Integer cdkId;
    private String type;
    private Date cdkLogTime;
}
