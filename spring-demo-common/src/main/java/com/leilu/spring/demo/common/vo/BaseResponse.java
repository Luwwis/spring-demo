package com.leilu.spring.demo.common.vo;

import com.leilu.spring.demo.common.exception.BaseError;
import com.leilu.spring.demo.common.exception.ErrorMessage;

/**
 * Created by leilu on 2019/8/16.
 */
public class BaseResponse<T> implements ApiResponse<T> {
    private int code;
    private String msg;
    private T data;

    public BaseResponse(){
        this(BaseError.SUCCESS);
    }
    public BaseResponse(ErrorMessage errorMessage){
        this.code=errorMessage.getCode();
        this.msg=errorMessage.getMsg();
    }
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public void setCode(int code) {
        this.code=code;
    }

    @Override
    public void setMsg(String msg) {
        this.msg=msg;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data=data;
    }
}
