package com.taiwan.entity.result;

import com.taiwan.domain.Position;
import lombok.Data;

import java.util.List;

@Data
public class ResultKillMonster {
    private Integer eid;
    private Position position;
    private Long coins;
    private List<ResultItem> eqInfos;
    private List<ResultItem> itemInfos;
}
