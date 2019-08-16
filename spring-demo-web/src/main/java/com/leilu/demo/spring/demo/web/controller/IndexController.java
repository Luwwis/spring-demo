package com.leilu.demo.spring.demo.web.controller;

import com.leilu.demo.spring.demo.web.domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leilu on 2019/6/4.
 */
@RestController
public class IndexController {
    @RequestMapping("/hello")
    public User hello(String name){
        User user=new User();
        user.setName("leilu");
        return user;
    }

}
