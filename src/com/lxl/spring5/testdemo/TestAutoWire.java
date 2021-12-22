package com.lxl.spring5.testdemo;

import com.lxl.spring5.autowire.Emp;
import com.lxl.spring5.lifecyclebean.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {
    @Test
    public void TestLifeCycle(){
//        ApplicationContext context = new  ClassPathXmlApplicationContext("bean7.xml");
//        ClassPathXmlApplicationContext 为ApplicationContext子实现类
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("bean9.xml");
        //2 获取配置创建的对象，user为配置文件中id
//        MyBean myBean = context.getBean("myBean", MyBean.class);
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}
