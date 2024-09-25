package com.taiwan.domain;

import com.taiwan.domain.WeChat.SessionResponse;
import lombok.Data;

@Data
public class DouYin {
    private Integer err_no;
    private String err_tips;
    private SessionResponse data;
}
