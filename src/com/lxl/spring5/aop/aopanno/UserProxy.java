package com.lxl.spring5.aop.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect
@Order(2)
// 生成代理对象
public class UserProxy {

    //共同切入点抽取
    @Pointcut(value = "execution(* com.lxl.spring5.aop.aopanno.User.add(..))")
    public void samepoint() { }

    // 前置通知
    //@Before注解表示作为前置通知
    @Before(value = "samepoint()")
//    @Before(value = "execution(* com.lxl.spring5.aop.aspectjanno.User.add(..))")
    public void before() {
        System.out.println("UserProxy before.........");
    }

    //后置通知（返回通知）
//    在方法返回结果之后执行
//    异常时不执行
    @AfterReturning(value = "execution(* com.lxl.spring5.aop.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }

    //最终通知
//    方法之后执行
//    异常时也执行
    @After(value = "execution(* com.lxl.spring5.aop.aopanno.User.add(..))")
    public void after() {
        System.out.println("after.........");
    }

    //异常通知
//    出现异常执行
    @AfterThrowing(value = "execution(* com.lxl.spring5.aop.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }

    //环绕通知
    @Around(value = "execution(* com.lxl.spring5.aop.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
// 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }
}
