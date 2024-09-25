package com.taiwan.entity.result;

import com.taiwan.domain.OrderInfo;
import lombok.Data;
import java.util.List;

@Data
public class ResultAgentUser {
    private Integer role_no;
    private String name;
    private Integer orderCount;
    private Integer orderPrice;
    private List<OrderInfo> orders;
}
