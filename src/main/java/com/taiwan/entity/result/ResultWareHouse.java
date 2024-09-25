package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;


@Data
public class ResultWareHouse {
    private List<Object> items;
    private List<Integer> itemsWareHouse;
    public ResultWareHouse(){}
    public ResultWareHouse(List<Object> items,List<Integer> itemsWareHouse) {
        this.items = items;
        this.itemsWareHouse = itemsWareHouse;
    }
}
