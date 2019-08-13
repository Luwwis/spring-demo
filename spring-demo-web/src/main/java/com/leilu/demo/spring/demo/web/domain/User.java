package com.leilu.demo.spring.demo.web.domain;

/**
 * Created by leilu on 2019/6/4.
 */
public class User {

    private Long userId;
    private String name;
    private String passWord;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
