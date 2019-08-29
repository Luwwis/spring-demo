package com.leilu.demo.spring.demo.web.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leilu on 2019/8/16.
 */
@Configuration
public class ShiroConfig {
    public ShiroFilterFactoryBean shiroFilterFactoryBean(){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();

        Map<String,String> filterChainDefinitionMap=new HashMap<>();
        //无需shiro过滤的请求
        filterChainDefinitionMap.put("/api/**","anon");
        filterChainDefinitionMap.put("/**","cas");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }
}
