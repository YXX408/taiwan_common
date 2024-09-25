package com.taiwan.entity;

import lombok.Data;

import java.util.Date;

@Data
public class EventInfoVo {
    private Integer eventId;
    private Integer newEventId;
    private String eventType;
    private Integer lv;
    private String content;
    private Date startTime;
    private Date endTime;

}
