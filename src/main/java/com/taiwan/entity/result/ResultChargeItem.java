package com.taiwan.entity.result;

import com.taiwan.domain.ItemCdk;
import com.taiwan.domain.basic.ItemInfo;
import lombok.Data;

@Data
public class ResultChargeItem {
    private Integer number;
    private ItemInfo itemInfo;
    private  Integer id;
}
