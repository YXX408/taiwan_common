package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultUseEnhTicket {
    private String name;
    private Boolean isSuccess;
    private ResultEnh beforeEnh;
    private ResultEnh afterEnh;
}
