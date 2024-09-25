package com.taiwan.domain;

import lombok.Data;

@Data
public class TaskCond {
    private Integer taskCondId;
    private Integer task_no;
    private Integer condId;
    private Integer needNumber;
    private Integer finishNumber;
    private Integer finish;

}
