package com.lxl.spring5.testdemo;

//import com.lxl.spring5.annotation.UserService;
import com.lxl.spring5.annotation.propertyanno.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class TestAnnotation {
//    注解对象注入测试
//    @Test
//    public void testAnnotation() {
////        spring-aop-4.3.10.RELEASE 包未导入会报错：Unexpected exception parsing XML document from class path resource
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean11.xml");
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.add();
//    }

//    注解，属性注入测试
    @Test
    public void testAnnotationProperty() {
//        spring-aop-4.3.10.RELEASE 包未导入会报错：Unexpected exception parsing XML document from class path resource
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean12.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
