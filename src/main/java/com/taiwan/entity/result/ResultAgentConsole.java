package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultAgentConsole {
    //代理人id
    private Integer agentId;
    //代理人姓名
    private String name;
    //代理人账号
    private String account;
    //代理人头像
    private String avatar;
    //cdk数量
    private Integer cdkCount;
    //用户角色数量
    private Integer userRoleCount;
    //总订单数
    private Integer total_OrderCount;
    //总金额
    private Integer total_price;
    //今日订单数
    private Integer tdOrderCount;
    //昨日订单数
    private Integer ydOrderCount;
    //今日金额数
    private Integer tdOrderPrice;
    //昨日金额数
    private Integer ydOrderPrice;
    private ResultChartDom week;
    private ResultChartDom month;

}
