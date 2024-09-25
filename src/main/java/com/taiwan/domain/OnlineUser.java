package com.taiwan.domain;

import lombok.Data;

import java.io.Serializable;
import java.net.InetAddress;

@Data
public class OnlineUser implements Serializable {
    private String username;
    private InetAddress ipAddress;
    private Integer port;
    public OnlineUser(String username, InetAddress ipAddress, int port) {
        this.username = username;
        this.ipAddress = ipAddress;
        this.port = port;
    }
}
