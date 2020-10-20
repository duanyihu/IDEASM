package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.util.MybatisUtil;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements  UserService {
    @Override
    public void register(User user) {
        try{
            //UUID作为主键
            String id = UUID.randomUUID().toString();
            user.setId(id);
            //获取DAO的实现类对象
            UserDAO userDAO = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
            userDAO.save(user);
            MybatisUtil.commit();
        }catch (Exception e){
            MybatisUtil.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public List<User> showAll() {
        UserDAO userDAO = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
        List<User> users = userDAO.selectAll();
        //关掉SqlSession
        MybatisUtil.close();
        return  users;
    }
}
