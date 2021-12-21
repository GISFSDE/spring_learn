package com.lxl.spring5.testdemo;

import com.lxl.spring5.Book;
import com.lxl.spring5.Orders;
import com.lxl.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new  ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象，user为配置文件中id
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void testIOCSet(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new  ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象，user为配置文件中id
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.ShowBook();

    }

    @Test
    public void testIOCCon(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new  ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象，user为配置文件中id
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ShowOrder();

    }
}
