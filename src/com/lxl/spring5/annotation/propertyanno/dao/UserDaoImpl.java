package com.lxl.spring5.annotation.propertyanno.dao;

import com.lxl.spring5.annotation.propertyanno.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao update ...");
    }
}
