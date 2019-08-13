package com.xiaoju.leilu.spring.demo.common.exception;

/**
 * Created by leilu on 2019/8/13.
 */
public class BaseException extends RuntimeException implements ErrorMessage{
    private ErrorMessage errorMessage;
    private Integer code;
    private String msg;

    public BaseException(ErrorMessage errorMessage){
        this.errorMessage=errorMessage;
        this.code=errorMessage.getCode();
        this.msg=errorMessage.getMsg();
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
