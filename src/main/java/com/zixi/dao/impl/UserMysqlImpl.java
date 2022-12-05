package com.zixi.dao.impl;

import com.zixi.dao.User;

public class UserMysqlImpl implements User {
    @Override
    public void getUser() {
        System.out.println("Mysql据库访问User表");
    }
}
