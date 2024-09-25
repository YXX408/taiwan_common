package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultChest {
    private Long coins;
    private Integer chestType;
    private List<ResultItem> items;
}
