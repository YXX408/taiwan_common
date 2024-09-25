package com.taiwan.entity.result;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ResultEmailLog {
    private Integer elId;
    private String emailName;
    private String type;
    private String detail;
    private List<ResultItem> itemInfos;
    private Long coins;
    private Long diamonds;
    private Integer claim;
    private Integer open;
    private Long time;
    private String receivedTime;
    private Integer role_no;
}
