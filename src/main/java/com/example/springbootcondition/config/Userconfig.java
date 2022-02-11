package com.example.springbootcondition.config;

import com.example.springbootcondition.Condition.ClassCondition;
import com.example.springbootcondition.Condition.ConditionOnClass;
import com.example.springbootcondition.Pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Userconfig {
    @Bean
//    @Conditional(ClassCondition.class)
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public  User user(){
        return new User();
    }
    @Bean
    @ConditionalOnProperty(name="yjh",havingValue = "yjh")
    public  User user1(){
        return new User();
    }
}
