package com.taiwan.constant;

/**
 * 状态码常量
 */
public class CodeConstant {
    public  static  final  Integer SUCCESS = 200;
    public  static  final  Integer FAIL = 1000;
    public  static  final  Integer Unauthorized = 401;//表示未经授权
    public  static  final  Integer Forbidden = 403;//表示禁止访问
    public  static  final  Integer SERVER_ERROR = 500;//表示服务器内部错误
    public  static  final  Integer SC_TOO_MANY_REQUESTS = 429;//表示太多的请求
    public  static  final  Integer INSUFFICIENT_COUPONS = 999;//表示点卷数量不足
    public  static  final  Integer DIAMOND_SHORTAGE = 998;//表示点卷数量不足
    public  static  final  Integer BUY_LIMIT = 997;//限购
}
