package com.taiwan.domain.WeChat;

import lombok.Data;

@Data
public class AccessToken {
    private String access_token;
    private Integer expires_in;
}
