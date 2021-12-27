package com.lxl.spring5.aop.aopanno;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add() {
        System.out.println("add.......");
    }
}
