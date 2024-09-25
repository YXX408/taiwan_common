package com.taiwan.entity.result;

import com.taiwan.domain.basic.ItemInfo;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class ResultCdkPrice {

    private ArrayList<ResultCdkPriceItm> totalPrice;
    private HashMap<String,ArrayList<ResultCdkPriceItm>> unitPrice;

}
