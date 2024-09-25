package com.taiwan.entity.result;

import lombok.Data;

import java.lang.reflect.Field;
import java.math.BigDecimal;

@Data
public class ResultUserRoleProp {
    private Boolean isRole;
    private Integer role_no;
    private String roleName;
    private String avatar;
    private Integer lv;
    //名称
    private String name;
    //用户角色属性
    private ResultAttr userRoleAttr;
    //用户装备属性
    private ResultAttr userEqAttr;
}
