package com.taiwan.entity.result;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ResultCdkInfo {
    private Integer cdkId;
    private String code;
    private Date startTime;
    private Date endTime;
    private String type;
    private List<ResultItem> itemInfos;
    private Long coins;
    private Long diamonds;
}
