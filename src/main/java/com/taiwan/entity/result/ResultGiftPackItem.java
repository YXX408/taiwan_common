package com.taiwan.entity.result;

import lombok.Data;
import java.util.List;

@Data
public class ResultGiftPackItem {
    private Long coins;
    private Long diamonds;
    private List<ResultItem> itemInfos;
}
