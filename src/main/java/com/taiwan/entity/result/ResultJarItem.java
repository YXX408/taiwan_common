package com.taiwan.entity.result;

import lombok.Data;

@Data
public class ResultJarItem extends ResultItem{
   private Integer id;
   private Integer number;
   private String icon;
   private String name;
   private Integer color;
   private Integer needAnounce;//是否需要公告
   private String  nouse1;
   private String  color1;
}
