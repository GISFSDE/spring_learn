package com.lxl.spring5.aop.aopanno;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect
@Order(1)
// 生成代理对象
public class PersonProxy {

    //共同切入点抽取
    @Pointcut(value = "execution(* com.lxl.spring5.aop.aopanno.User.add(..))")
    public void samepoint() { }

    // 前置通知
    //@Before注解表示作为前置通知
    @Before(value = "samepoint()")
//    @Before(value = "execution(* com.lxl.spring5.aop.aspectjanno.User.add(..))")
    public void before() {
        System.out.println("PersonProxy  before.........");
    }

}
