package com.taiwan.domain;


import lombok.Data;

import java.util.Date;


@Data
public class CShInfo {
    private Integer cshId;
    private Integer role_no;
    private Integer isCycle;
    private Integer cycleTime;
    private Date startTime;
    private Date endTime;
    private String content;
}
