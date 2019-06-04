package com.leilu.demo.spring.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by leilu on 2019/6/4.
 */
@SpringBootApplication
@EnableScheduling
@EnableCaching
@ComponentScan("com.leilu.demo.spring")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
