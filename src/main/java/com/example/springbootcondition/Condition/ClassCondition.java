package com.example.springbootcondition.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//       导入jedis的坐标
//        思路判读redis.clients.jedis.Jedis文件是否存在
//        boolean flag = true;
//        try {
//            Class<?> aClass = Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            flag = false;
//        }
//        return flag;


//导入通过注解属性值value值指定坐标后创建bean
//        获取注解属性值    value
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
//        System.out.println(map);
        String[] value = (String[]) map.get("value");
        boolean flag = true;
        try {
            for (String classname : value) {
                Class<?> aClass = Class.forName(classname);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;









    }
}
