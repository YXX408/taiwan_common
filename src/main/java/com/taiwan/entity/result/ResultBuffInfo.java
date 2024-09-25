package com.taiwan.entity.result;

import com.taiwan.domain.basic.Buff;
import com.taiwan.domain.basic.BuffInfo;
import lombok.Data;

@Data
public class ResultBuffInfo {
    private Buff buff;
    private BuffInfo buffInfo;
}
