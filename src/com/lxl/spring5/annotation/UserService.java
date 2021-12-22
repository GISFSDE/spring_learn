package com.lxl.spring5.annotation;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以省略不写，
// 默认值是类名称，首字母小写
// UserService -- userService
@Component(value = "userService") //等同<bean id="userService" class=".."/>
/**
 * @author Administrator*/
//@Component
//@Service
//@Controller
//@Repository
// 四个注解效果相同，习惯用在不同层
public class UserService {
    public void add() {
        System.out.println("service add ...");
    }
}
