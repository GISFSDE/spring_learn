package com.lxl.spring5.testdemo;

import com.lxl.spring5.bean.Emp;
import com.lxl.spring5.collectiontype.Course;
import com.lxl.spring5.factorybean.MyBean;
import com.lxl.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @Test
    public void testFactoryBean(){
        ApplicationContext context =
                new  ClassPathXmlApplicationContext("bean7.xml");
        //2 获取配置创建的对象，user为配置文件中id
//        MyBean myBean = context.getBean("myBean", MyBean.class);
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);

    }
}
