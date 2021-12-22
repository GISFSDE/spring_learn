package com.lxl.spring5.testdemo;

import com.lxl.spring5.Book;
import com.lxl.spring5.Orders;
import com.lxl.spring5.User;
import com.lxl.spring5.bean.Emp;
import com.lxl.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new  ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象，user为配置文件中id
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }
    @Test
    public void testOneToMore(){
//1 加载 spring 配置文件
//      ClassPathXmlApplicationContext()  web src 下配置文件
//        FileSystemXmlApplicationContext()   指定路径配置文件
        ApplicationContext context =
                new  ClassPathXmlApplicationContext("bean3.xml");
        //2 获取配置创建的对象，user为配置文件中id
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();

    }
}
