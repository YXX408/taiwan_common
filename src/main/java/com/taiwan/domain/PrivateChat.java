package com.taiwan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class PrivateChat {
    private Integer chatId;
    private Integer sendUserRNo;
    private Integer acceptUserRno;
    private String text;
    private Date sendtime;
    private Integer isRead;
    private Integer isNavigation;
    private String orderCardList;
}
