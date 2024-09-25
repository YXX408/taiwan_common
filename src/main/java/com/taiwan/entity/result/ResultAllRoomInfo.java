package com.taiwan.entity.result;

import com.taiwan.domain.UserRole;
import lombok.Data;

@Data
public class ResultAllRoomInfo {
    private ResultNameAvatarLv userRole;//房主信息
    private Integer teamSize;//队伍成员
    private Integer roomId;//房间id
}
