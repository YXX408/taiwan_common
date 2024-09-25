package com.taiwan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class EmailLog {
    private Integer elId;
    private Integer role_no;
    private Integer emailId;
    private Date receivedTime;
    private Integer claim;
    private Integer open;
    public EmailLog() { }
    public EmailLog(Integer role_no,Integer emailId,Date receivedTime,Integer claim,Integer open) {
        this.role_no = role_no;
        this.emailId = emailId;
        this.receivedTime = receivedTime;
        this.claim = claim;
        this.open = open;
    }
    public EmailLog(Integer emailId,Date receivedTime,Integer claim,Integer open) {
        this.emailId = emailId;
        this.receivedTime = receivedTime;
        this.claim = claim;
        this.open = open;
    }
}
