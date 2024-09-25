package com.taiwan.entity.result;

import com.taiwan.domain.basic.ItemInfo;
import lombok.Data;

@Data
public class ResultCdkPriceItm {
    private Integer num;
    private Integer itemId;
    private ItemInfo resultItemInfo;
    private Boolean completionPrice;
}
