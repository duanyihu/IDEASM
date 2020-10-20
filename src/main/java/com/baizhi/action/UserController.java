package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.service.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class UserController   extends ActionSupport {
    //接收数据
    private User  user;
    //传递数据
    private List<User> users;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public   String   register(){
        UserService  userService=new UserServiceImpl();
        //调用业务
        userService.register(user);
        //流程跳转
        return   "index";
    }


    public   String   showAll(){
        //调用业务
        UserService  userService= new  UserServiceImpl();
        //流程跳转
        users = userService.showAll();
        //跳转页面
        return "showAll";
    }










}
