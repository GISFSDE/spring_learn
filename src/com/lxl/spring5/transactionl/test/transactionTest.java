package com.lxl.spring5.transactionl.test;

import com.lxl.spring5.transactionl.TxConfig;
import com.lxl.spring5.transactionl.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PrivateKey;

public class transactionTest {
    //半注解方式测试
    //    添加@Transaction注解
    @Test
    public void transactionAnnoTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    //XML方式测试
//    先去掉@Transaction注解
    @Test
    public void transactionXMLTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    //全注解方式测试
//    先去掉@Transaction注解
    @Test
    public void transactionAllAnnoTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    @Test
    public void  manualLogTest(){
        final Logger log = LoggerFactory.getLogger(transactionTest.class);
        log.warn("hello log4j==============");
    }
}
