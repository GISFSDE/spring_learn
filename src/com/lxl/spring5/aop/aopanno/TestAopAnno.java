package com.lxl.spring5.aop.aopanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopAnno {
    @Test
    public void TestAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop1.xml");
       User user= context.getBean("user",User.class);
        user.add();


    }
}
