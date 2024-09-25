package com.taiwan.entity.result;

import lombok.Data;

import java.util.Date;


@Data
public class ResultUserDungeon {
    private Integer dungeon_no;
    private Integer role_no;
    private String name;
    private Integer dungeonId;
    private String dungeonName;
    private String startTime;
    private String endTime;
    private Integer isClear;
}
