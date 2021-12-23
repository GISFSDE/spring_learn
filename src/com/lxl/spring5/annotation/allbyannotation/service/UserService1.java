package com.lxl.spring5.annotation.allbyannotation.service;


import com.lxl.spring5.annotation.propertyanno.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



/**
 * @author Administrator
 */
@Service
// 四个注解效果相同，习惯用在不同层
public class UserService1 {

//   （4）@Value注入普通类型属性
    @Value("lxl")
    String name;

    public void add() {
        System.out.println("service add ..."+name);
    }
}
