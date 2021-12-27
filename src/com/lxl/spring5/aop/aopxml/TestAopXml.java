package com.lxl.spring5.aop.aopxml;

import com.lxl.spring5.aop.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopXml {
    @Test
    public void TestAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
       Book book= context.getBean("book",Book.class);
        book.buy();


    }
}
