package com.lxl.spring5.transactionl.service;

import com.lxl.spring5.transactionl.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class UserService {
    //        注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
        // lucy少100
        userDao.reduceMoney();

//        出现异常
        int i=10/0;

        // mary多100
        userDao.addMoney();
    }
}

