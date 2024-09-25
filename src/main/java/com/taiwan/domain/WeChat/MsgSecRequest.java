package com.taiwan.domain.WeChat;

import lombok.Data;

@Data
public class MsgSecRequest {
    private String openid;
    private Integer version;
    private Integer scene;
    private String content;
    public MsgSecRequest(String openid,Integer version,Integer scene,String content){
        this.openid = openid;
        this.version = version;
        this.scene = scene;
        this.content = content;
    }
}
