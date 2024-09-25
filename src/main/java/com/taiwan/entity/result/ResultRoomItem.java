package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultRoomItem {
    private Integer roleNo;
    private Integer lv;
    private String  roleName;
    private String roomId;
    private String avatar;
    private Integer rid;
    private String skinResId;//皮肤资源Id
    private String wpnResiD;//武器资源id
    private Integer ownerRoleNo;
}
