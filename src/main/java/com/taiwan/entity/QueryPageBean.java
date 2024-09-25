package com.taiwan.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class QueryPageBean implements Serializable{
    private Integer currentPage;//页码
    private Integer pageSize;//每页记录数
    private String queryId;//查询条件
    private String queryType;//查询条件
    private String queryString;//查询条件
    private Integer queryInt;
    private Boolean queryBool;
    private List<Date> queryData;//查询条件
}