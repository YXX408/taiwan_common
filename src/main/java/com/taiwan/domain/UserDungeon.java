package com.taiwan.domain;

import lombok.Data;

import java.util.Date;


@Data
public class UserDungeon {
    private Integer dungeon_no;
    private Integer role_no;
    private Integer dungeonId;
    private Date startTime;
    private Date endTime;
    private Integer isClear;
}
