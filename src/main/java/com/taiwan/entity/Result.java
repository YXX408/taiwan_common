package com.taiwan.entity;

import com.taiwan.entity.result.ResultAllItems;
import com.taiwan.entity.result.ResultItem;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 数据响应对象
 *    {
 *      success ：是否成功
 *      code    ：返回码
 *      message ：返回信息
 *      //返回数据
 *      data：  ：{
 *
 *      }
 *    }
 */
@Data
@NoArgsConstructor
public class Result {

    private boolean flag;//是否成功
    private Integer code;// 返回码
    private String message;//返回信息
    private Object data;// 返回数据
    private String interfaceName; // 接口名

    public Result(ResultCode code) {
        this.flag = code.flag;
        this.code = code.code;
        this.message = code.message;
    }
    public Result(ResultCode code, Object data) {
        this.flag = code.flag;
        this.code = code.code;
        if (code.message == null){
            this.message = (String) data;
        }else {
            this.message = code.message;
            this.data = data;
        }
    }
    public Result(ResultCode code,String message, String interfaceName) {
        this.flag = code.flag;
        this.code = code.code;
        this.message = message;
        this.interfaceName = interfaceName;
    }
    public Result(ResultCode code, Object data, String interfaceName) {
        this.flag = code.flag;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
        this.interfaceName = interfaceName;
    }
    public Result(ResultCode code,String message, Object data) {
        this.flag = code.flag;
        this.code = code.code;
        this.message = message;
        this.data = data;
    }
    public Result(Integer code , boolean flag, String message) {
        this.code = code;
        this.message = message;
        this.flag = flag;
    }
    public Result(Integer code, boolean flag, String message, Object data) {
        this.code = code;
        this.message = message;
        this.flag = flag;
        this.data = data;
    }

    public Result(Integer code, boolean flag, String message,Object data, String interfaceName) {
        this.code = code;
        this.message = message;
        this.flag = flag;
        this.data = data;
        this.interfaceName = interfaceName;
    }

    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }

    public static Result ERROR(){
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }
}
