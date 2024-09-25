package com.taiwan.entity.result;

import lombok.Data;

import java.util.Date;

@Data
public class ResultCdkInfoByAgent {
    private Integer cdkId;
    private String code;
    private String startTime;
    private String endTime;
    private String type;
    private Integer number;
    private Integer valid;
    private String items;
    private Integer agentId;
    private String typeRefer;
}
