package com.taiwan.domain;

import lombok.Data;
@Data
public class ServerInfoResult {
        Integer serverId;
        String  serviceIp;
        Integer port;
        String  isOpen;
        String  alias;
        String httpIp;
        Integer serverCount;
}
