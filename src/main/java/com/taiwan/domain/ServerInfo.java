package com.taiwan.domain;

import lombok.Data;

@Data
public class ServerInfo {
   private Integer serverId;
   private String  serviceIp;
   private Integer port;
   private String  isOpen;
   private  String  alias;
   private String httpIp;
   private Integer count;
   private String ip;
}
