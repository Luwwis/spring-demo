package com.leilu.demo.spring.demo.web.datasource;

import com.leilu.demo.spring.demo.web.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leilu on 2019/6/4.
 */
public class StaticData {
    public static Map<String,User> userMap;

    static {
        userMap=new HashMap<>();
        User user1=new User();
        user1.setUserId(1001L);
        user1.setName("leilu");
        user1.setPassWord("leiluws");
    }
}
