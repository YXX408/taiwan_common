package com.taiwan.merge;

import lombok.Data;

import java.util.Date;
@Data
public class MergeEmailLog {
    private Integer role_no;
    private Integer emailId;
    private Date receivedTime;
    private Integer claim;
    private Integer open;
}
