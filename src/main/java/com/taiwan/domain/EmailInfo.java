package com.taiwan.domain;

import com.taiwan.entity.ResultCode;
import lombok.Data;

@Data
public class EmailInfo {
    private Integer emailId;
    private String emailName;
    private String type;
    private String detail;
    private String items;
    private Integer expirationDate;
    public EmailInfo() { }
    public EmailInfo(String emailName,String type,String detail,String items,Integer expirationDate) {
        this.emailName = emailName;
        this.type = type;
        this.detail = detail;
        this.items = items;
        this.expirationDate = expirationDate;
    }
}
