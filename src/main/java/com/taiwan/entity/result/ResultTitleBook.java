package com.taiwan.entity.result;

import com.taiwan.domain.basic.EquipAttr;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ResultTitleBook {
    private String nouse1;
    private List<ResultUserTtlBook> userItems;
    private String equipAttrName;
    private List<Map<String,Object>> equipAttr;
}
