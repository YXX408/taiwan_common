package com.taiwan.merge;

import lombok.Data;

import java.util.Date;
@Data
public class MergeTimerInfo {
    private Integer type;
    private Date time;
    private Integer timeInterval;
    private Integer valid;
    private String content;
    private String description;
}
