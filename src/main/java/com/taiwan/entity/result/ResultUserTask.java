package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUserTask {
    private Integer taskId;
    private String taskName;
    private Integer state;
}
