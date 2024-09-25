package com.taiwan.entity;

import com.taiwan.domain.UserRole;
import com.taiwan.entity.result.ResultUserRoleProps;
import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Data
public class UserRoleForUpdate  {
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
    private String lastloginTime;
    private Integer copyRole_no;
}
