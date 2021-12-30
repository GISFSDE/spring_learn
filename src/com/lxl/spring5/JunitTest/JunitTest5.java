package com.lxl.spring5.JunitTest;

import com.lxl.spring5.transactionl.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:transaction1.xml")
//SpringJUnitConfig效果同上面两个同时使用
@SpringJUnitConfig(locations = "classpath:transaction1.xml")
public class JunitTest5 {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}