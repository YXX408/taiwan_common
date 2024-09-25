package com.taiwan.merge;

import lombok.Data;

import java.util.Date;
@Data
public class MergeUserDungeon {
    private Integer role_no;
    private Integer dungeonId;
    private Date startTime;
    private Date endTime;
    private Integer isClear;
}
