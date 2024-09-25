package com.taiwan.entity.result;

import com.taiwan.domain.Position;
import lombok.Data;

import java.util.List;

@Data
public class ResultItems {
    private Long coins;
    private Position position;
    private List<ResultItem> eqInfos;
    private List<ResultItem> itemInfos;
}
