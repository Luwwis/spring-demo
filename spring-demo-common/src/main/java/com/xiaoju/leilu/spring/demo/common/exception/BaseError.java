package com.xiaoju.leilu.spring.demo.common.exception;

/**
 * Created by leilu on 2019/8/13.
 */
public enum BaseError implements ErrorMessage{

    SUCCESS(0,"成功"),
    PARAMETER_ERROR(1001,"参数异常"),
    SIGN_ERROR(1002,"签名错误"),
    NOT_LOGIN(1003,"未登录"),
    UNKNOWN_USER(1004,"用户不存在"),

    SYSTEM_ERROR(9999,"系统异常"),
    ;

    private Integer code;
    private String msg;

    BaseError(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
