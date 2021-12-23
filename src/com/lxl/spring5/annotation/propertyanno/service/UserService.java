package com.lxl.spring5.annotation.propertyanno.service;


import com.lxl.spring5.annotation.propertyanno.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//在注解里面value属性值可以省略不写，
// 默认值是类名称，首字母小写
// UserService -- userService
//@Component(value = "userService") //等同<bean id="userService" class=".."/>

/**
 * @author Administrator
 */
//@Component
@Service
//@Controller
//@Repository
// 四个注解效果相同，习惯用在不同层
public class UserService {
    //定义dao类型属性
// 不需要添加set方法
// 添加注入属性注解
//    （1） @Autowired  根据属性类型进行自动装配
//    @Autowired
//    （2）@Qualifier：根据名称进行注入,和@Autowired一起使用 在同类型有不同实现时，@Autowire决定类型，@Qualifier决定类型下具体对象名称：比如Impl中的@Repository("userDaoImpl1")
//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
//    （3）@Resource 根据类型进行注入，@Resource 为javax扩展包中的注解，官方不建议使用
    //@Resource
    //@Resource 根据名称进行注入
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;
//   （4）@Value注入普通类型属性
    @Value("lxl")
    String name;

    public void add() {
        System.out.println("service add ..."+name);
        userDao.add();
    }
}
