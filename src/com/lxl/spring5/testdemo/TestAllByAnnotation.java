package com.lxl.spring5.testdemo;

import com.lxl.spring5.annotation.allbyannotation.config.SpringConfig;
import com.lxl.spring5.annotation.allbyannotation.service.UserService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAllByAnnotation {
    @Test
    public void testAllByAnnotation(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService1 userService1 = context.getBean("userService1", UserService1.class);
        userService1.add();
    }
}
