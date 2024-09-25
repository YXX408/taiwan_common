package com.taiwan.domain;

import lombok.Data;
import java.util.Date;

@Data
public class EventInfo {
    private Integer eventId;
    private String eventType;
    private Integer lv;
    private String content;
    private Date startTime;
    private Date endTime;

}
