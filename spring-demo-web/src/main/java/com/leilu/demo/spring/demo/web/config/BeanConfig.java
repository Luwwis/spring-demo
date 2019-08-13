package com.leilu.demo.spring.demo.web.config;

import com.leilu.spring.demo.common.filter.RequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leilu on 2019/8/13.
 */
@Configuration
public class BeanConfig {

    @Bean
    public RequestFilter requestFilter(){
        return new RequestFilter();
    }
}
