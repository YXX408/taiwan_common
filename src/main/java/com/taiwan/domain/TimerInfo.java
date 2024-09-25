package com.taiwan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class TimerInfo {
    private Integer timerId;
    private Integer type;
    private Date time;
    private Integer timeInterval;
    private Integer valid;
    private String content;
    private String description;
}
