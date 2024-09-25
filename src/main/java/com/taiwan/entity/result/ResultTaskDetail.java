package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultTaskDetail {
    private String taskInformationText;
    private String taskText;
    private ResultTaskAward award;
    private List<ResultCond> taskInfo;
}
