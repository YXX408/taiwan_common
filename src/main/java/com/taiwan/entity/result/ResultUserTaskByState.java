package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserTaskByState {
    private Integer taskId;
    private String taskName;
    private Integer taskType;
    private String taskInformationText;
    private Integer state;
}
