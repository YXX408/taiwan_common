package com.taiwan.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Input implements Serializable {
    private String path;
    private String value;
}
