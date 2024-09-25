package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CdkInfo implements Serializable {
    private Integer cdkId;
    private String code;
    private Date startTime;
    private Date endTime;
    private String type;
    private Integer number;
    private Integer valid;
    private String items;
    private Integer agentId;
    private String typeRefer;
}
