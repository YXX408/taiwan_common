package com.taiwan.entity.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultEqForgeByMain {
    private String mainTypeName;
    private List<ResultEqForgeBySub> eqForgeBySub;
}
