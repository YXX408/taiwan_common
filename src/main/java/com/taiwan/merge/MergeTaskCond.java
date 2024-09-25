package com.taiwan.merge;

import lombok.Data;

@Data
public class MergeTaskCond {
    private Integer task_no;
    private Integer condId;
    private Integer needNumber;
    private Integer finishNumber;
    private Integer finish;
}
