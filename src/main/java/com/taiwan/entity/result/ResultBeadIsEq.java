package com.taiwan.entity.result;

import com.taiwan.domain.basic.EquipAttr;
import lombok.Data;

import java.util.List;
@Data
//装备上的宝珠属性
public class ResultBeadIsEq {

    private String attachBuffDesc;

    //装备评分
    private Integer eqRating;

    private List attribute;

    private EquipAttr beadEquipAttr;
}
