package com.taiwan.domain;

import com.taiwan.entity.result.ResultUserRoleProps;
import lombok.Data;

import java.util.Date;

@Data
public class UserRole {
    private Integer role_no;
    private Integer uid;
    private Integer rid;
    private String rName;
    private String name;
    private Integer exp;
    private Integer lv;
    private Integer bpSlot;
    private Integer whSlot;
    private Long coins;
    private Long diamonds;
    private Integer ft;
    private ResultUserRoleProps props;
    private Integer score;
    private Integer sort;
    private Integer agentId;
    private Date lastloginTime;
    private String avatar;
    private Integer serverId;
    //额外属性，判断角色是否进入队伍
    private Boolean flagIsInTeam;
}
