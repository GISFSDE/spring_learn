package com.lxl.spring5.testdemo;

import com.lxl.spring5.bean.Emp;
import com.lxl.spring5.collectiontype.Course;
import com.lxl.spring5.factorybean.MyBean;
import com.lxl.spring5.lifecyclebean.Orders;
import com.lxl.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void TestLifeCycle(){
//        ApplicationContext context = new  ClassPathXmlApplicationContext("bean7.xml");
//        ClassPathXmlApplicationContext 为ApplicationContext子实现类
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("bean8.xml");
        //2 获取配置创建的对象，user为配置文件中id
//        MyBean myBean = context.getBean("myBean", MyBean.class);
        Orders myBean = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建的bean实例");
        System.out.println(myBean);

        context.close();

    }
}
