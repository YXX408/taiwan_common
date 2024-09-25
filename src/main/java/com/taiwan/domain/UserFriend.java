package com.taiwan.domain;

import lombok.Data;

@Data
public class UserFriend {
    private Integer friendId;
    private Integer role_No;
    private Integer friend_No;
    private Integer isAdopt;
    private Integer isBlock;
}
