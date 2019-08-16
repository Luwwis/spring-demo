package com.leilu.spring.demo.common.vo;

/**
 * Created by leilu on 2019/8/16.
 */
public interface ApiResponse<T> {
    int getCode();

    String getMsg();

    void setCode(int code);

    void setMsg(String msg);

    T getData();

    void setData(T t);
}
