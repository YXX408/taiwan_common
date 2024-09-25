package com.taiwan.domain;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable {
    private Integer uid;
    private String openid;
    private String name;
    private Integer mode;
    private String avatar;
    private String type;
    private Date creationTime;
    private Integer lastLoginServer;
    private String havingRoleServer;
}
