package com.zixi.service.impl;

import com.zixi.dao.User;
import com.zixi.service.UserService;

public class UserServiceImpl implements UserService {

//    private User user = new UserImpl();
//    private User userMysql = new UserMysqlImpl();
    private User user;
    private void setUser(User user){
        this.user = user;
    }

    @Override
    public void getUsers() {

        user.getUser();
    }
}
