package com.taiwan.domain.WeChat;

import com.taiwan.domain.ServerInfo;
import lombok.Data;

import java.util.List;

@Data
public class SessionResponse {
    private String openid;
    private String session_key;
    private String SecWebSocketProtocol;
    private Integer mode;
    private String avatar;
    private Integer uid;
}
