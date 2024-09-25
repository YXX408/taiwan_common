package com.taiwan.entity.result;

import lombok.Data;

import java.util.Map;

@Data
public class ResultEqSuit {
    private Map<String,Boolean> eqNames;
    private Map<String,Object> eqAttrs;
}
