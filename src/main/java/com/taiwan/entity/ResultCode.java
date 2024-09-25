package com.taiwan.entity;


import com.taiwan.constant.CodeConstant;

/**
 * 公共的返回码
 *    返回码code：
 *      成功：200
 *      失败：1000
 *      未登录：401
 *      未授权：10
 *      抛出异常：99999
 */
public enum ResultCode {

    SUCCESS(true, CodeConstant.SUCCESS, "操作成功！"),
    //---系统错误返回码-----
    FAIL(false,CodeConstant.FAIL,"操作失败"),
    Unauthorized(false,CodeConstant.Unauthorized,"您还未登录"),
    UNAUTHORISE(false,CodeConstant.Forbidden,"权限不足"),
    SERVER_ERROR(false,CodeConstant.SERVER_ERROR,"抱歉，系统繁忙，请稍后重试！"),
    RESULT_SUCCESS(true, CodeConstant.SUCCESS),
    RESULT_FAIL(false, CodeConstant.FAIL),
    RESULT_INSUFFICIENT(true,CodeConstant.INSUFFICIENT_COUPONS,"点券不足"),
    RESULT_DIAMONDSHORTAGE(true,CodeConstant.DIAMOND_SHORTAGE,"点券不足"),
    RESULT_BUYLIMIT(true,CodeConstant.BUY_LIMIT,"超过限购次数");


    //操作是否成功
    boolean flag;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean flag, int code, String message){
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
    ResultCode(boolean flag, int code){
        this.flag = flag;
        this.code = code;
    }
    public boolean flag() {
        return flag;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
