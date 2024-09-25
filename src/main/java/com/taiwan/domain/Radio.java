package com.taiwan.domain;

import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class Radio {
    private List<Map<String, Object>> messages;
    private Long checkFrameId ;

    public Radio(List<Map<String, Object>> messages, Long checkFrameId) {
        this.messages = messages;
        this.checkFrameId = checkFrameId;
    }
}
