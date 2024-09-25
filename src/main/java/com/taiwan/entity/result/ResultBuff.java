package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultBuff {
    private Integer itemId;
    private Integer hp;
    private Integer mp;
    private Integer hpRate;
    private Integer mpRate;
    private Integer currentHpRate;
    private Integer subType;
    private Boolean isUseUp;
}
