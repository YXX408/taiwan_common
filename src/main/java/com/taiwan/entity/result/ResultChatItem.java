package com.taiwan.entity.result;

import com.taiwan.domain.PrivateChat;
import lombok.Data;

import java.util.Date;

@Data
public class ResultChatItem {
    private PrivateChat privateChat;
    private String name;
    private String avatar;
    private Integer lv;
    private Integer roleNo;
    private Integer noReadSize;
}
