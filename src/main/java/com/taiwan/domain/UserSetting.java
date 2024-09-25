package com.taiwan.domain;

import lombok.Data;

@Data
public class UserSetting {
    private Integer setId;
    private Integer uid;
    private Integer volume;
    private String volumeboole;
    private Integer music;
    private String musicboole;
}
