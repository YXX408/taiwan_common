package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultNotAdoptFriend {
    private Integer friendID ;
    private String name;
    private String avatar;
    private Integer lv;
}
