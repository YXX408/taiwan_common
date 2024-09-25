package com.taiwan.domain;

import lombok.Data;

@Data
public class UserTask {
    private Integer task_no;
    private Integer role_no;
    private Integer taskId;
    private Integer taskType;
    private Integer taskFinishType;
    private Integer state;
    private Integer playerLv;
}
