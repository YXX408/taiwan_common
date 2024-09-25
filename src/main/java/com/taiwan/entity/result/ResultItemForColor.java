package com.taiwan.entity.result;

import com.taiwan.domain.basic.ItemInfo;
import lombok.Data;

import java.util.ArrayList;
@Data
public class ResultItemForColor {
    private ArrayList<ResultItem> oneColorItemList;
    private ArrayList<ResultItem> twoColorItemList;
    private ArrayList<ResultItem> threeColorItemList;
    private ArrayList<ResultItem> fiveColorItemList;
    private ArrayList<ResultItem> sixColorItemList;
}
