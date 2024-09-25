package com.taiwan.domain;

import lombok.Data;

@Data
public class Agent {
    private Integer agentId;
    private String account;
    private String password;
    private String name;
    private String avatar;
}
