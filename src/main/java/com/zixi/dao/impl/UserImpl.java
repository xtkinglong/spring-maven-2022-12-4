package com.zixi.dao.impl;

import com.zixi.dao.User;

public class UserImpl implements User {
    @Override
    public void getUser() {
        System.out.println("数据库访问User表");
    }
}
