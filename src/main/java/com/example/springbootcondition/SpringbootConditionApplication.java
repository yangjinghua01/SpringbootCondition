package com.example.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {
     
    public static void main(String[] args) {
//        启动Springboot的应用返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
//获取Bean，RedisTemplate
//        Object redisTemplate = context.getBean("redisTemplate");
//        System.out.println(redisTemplate);
        Object user = context.getBean("user1");
        System.out.println(user);
    }

}
