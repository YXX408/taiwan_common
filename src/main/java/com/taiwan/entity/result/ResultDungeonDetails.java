package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ResultDungeonDetails {
    private Integer dungeonId;//副本id
    private String name;//名字
    private int hard;//难度
    private int fatigueValue;//疲劳值
    private String tumbPath;//小个的缩略图路径
    private List<Map<String,Object>> ItemList;//物品信息
    private ResultTicket ticket;//门票

}
