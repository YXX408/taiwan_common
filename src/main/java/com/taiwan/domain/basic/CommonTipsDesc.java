package com.taiwan.domain.basic;

import lombok.Data;

@Data
public class CommonTipsDesc {
    /**
     * 文字描述 | 为保留字符,一般情况不要使用
     */
    private String descs;
    /**
     * 显示类型  CT_MSG_BOX_OK:1:对话框OK提示 CT_MSG_BOX_OK_CANCEL:2:对话框OK_CANCEL提示 CT_MSG_BOX_CANCEL_OK:3:对话框CANCEL_OK提示 CT_CLICK_CONFIRM_FRAME:10:通用点击确认界面 CT_SYSTEM_TEXT_ANIMATION:20:系统通用文字提示动画 CT_TEXT_FLOAT_EFFECT:21:文字上飘效果 CT_SCROLL_LIGHT:100:跑马灯(用于公告系统,此处无效) CT_DUNGEON_TEXT_ANIMATION:40:地下城通用文字提示动画 CT_DUNGEON_TEXT_ANIMATION_2:41:地下城通用文字提示动画2 CT_HOT_UPDATE_OK:101:热更新对话框OK CT_HOT_UPDATE_OK_CANCEL:102:热更新确认取消对话框
     */
    private Integer showType;
    /**
     * 显示方式  SI_NULL:0:无效 SI_UNIQUE:1:唯一显示 SI_IMMEDIATELY:2:立即显示 SI_QUEUE:3:按队列显示
     */
    private Integer showMode;
    /**
     * 标题文字
     */
    private String titleText;
    /**
     * 确定按钮文字
     */
    private String buttonText;
    /**
     * 取消按钮文字
     */
    private String cancelBtnText;

}