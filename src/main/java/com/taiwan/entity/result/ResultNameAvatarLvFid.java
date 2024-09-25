package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultNameAvatarLvFid {
    private String name;
    private String avatar;
    private Integer lv;
    private Integer fid;
    private Integer roleNo;
    private Integer isOnline;
    private Integer isBlock;
    private Integer noReadSize;
}
