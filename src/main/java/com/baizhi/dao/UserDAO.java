package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO {
    //插入一条数据
    public   void  save(User  user);
    //查询所有
    public List<User> selectAll();
}
