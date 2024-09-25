package com.taiwan.entity.result;

import lombok.Data;

import java.util.Map;

@Data
public class ResultSkillMonster {
    private Integer skillID;
    /**
     * 冷却时间
     */
    private String refreshTime;
    /**
     * 技能属性  0:无 1:光 2:火 3:冰 4:暗 5:不受影响
     */
    private Integer skillAttri;
    private Map<Integer,ResultEffectMonster> effectMonsters;
}
