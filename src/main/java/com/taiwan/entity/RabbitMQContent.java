package com.taiwan.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RabbitMQContent implements Serializable {
    private Integer role_no;
    private Integer uid;
    private Input input;
}
