package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserTaskIsState {
    private Integer taskId;
    private String taskName;
    private Integer taskType;
    private String taskInformationText;
    private Integer state;
}
