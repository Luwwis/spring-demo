package com.leilu.demo.spring.demo.dao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leilu on 2019/6/4.
 */
@Configuration
@MapperScan(basePackages = "com.leilu.demo.spring.demo.dao.mapper")
public class DbConfig {

}
