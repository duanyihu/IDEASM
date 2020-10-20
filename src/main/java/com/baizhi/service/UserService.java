package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //注册
    public   void   register(User user);
    //查询所有
    public List<User> showAll();
}
