package com.taiwan.domain;

import com.taiwan.entity.result.ResultItem;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class OrderCard implements Serializable {
    private Integer id;
    private String number;
    private Integer order_id;
    private String secret;
    private ArrayList<ResultItem> resultItems;
    private Integer isReceive;
}
