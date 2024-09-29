package com.taiwan.domain;

import lombok.Data;

@Data
public class GameEvent {
    private Integer role_no;//角色id
    private Integer eventData; // 事件数据，可以是任务相关的信息
    private Integer eventDataNumber;
    private Integer taskId;
    private Integer team;
    private Integer taskFinishType;
    public GameEvent(Integer role_no,Integer taskId,Integer eventData,Integer eventDataNumber) {
        this.role_no = role_no;
        this.taskId = taskId;
        this.eventData = eventData;
        this.eventDataNumber = eventDataNumber;
    }
    public GameEvent() { }
}
