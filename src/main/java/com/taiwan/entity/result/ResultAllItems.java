package com.taiwan.entity.result;

import com.taiwan.domain.Position;
import lombok.Data;

import java.util.List;

@Data
public class ResultAllItems {
    private Long coins;
    private Long diamonds;
    private List<ResultItem> items;
}
