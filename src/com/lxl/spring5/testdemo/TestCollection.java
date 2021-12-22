package com.lxl.spring5.testdemo;

import com.lxl.spring5.collectiontype.Book;
import com.lxl.spring5.bean.Emp;
import com.lxl.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
    @Test
    public void testOneToMore(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        //2 获取配置创建的对象，user为配置文件中id
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }
    @Test
    public void testOneToMore1(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean6.xml");
        //2 获取配置创建的对象，user为配置文件中id
        Book book = context.getBean("book", Book.class);
        book.test();

    }
}
