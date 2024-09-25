package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUpgrade {
    private Boolean isUpgrade = false;
    private Integer exp;
    private Integer lv;
}
