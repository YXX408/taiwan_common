package com.taiwan.domain.WeChat;

import lombok.Data;

@Data
public class MsgSecResponse {
    private Integer errcode;
    private String errmsg;
    private MsgSecResult result;
    private String trace_id;
}
