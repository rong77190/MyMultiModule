package com.xiechur.controller;

import com.xiechur.model.User;
import com.xiechur.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiechur on 2016/8/25.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController{

    @Resource
    private UserService userService;


    /**
     * 查询用户列表
     */
    @RequestMapping(value = "userList")
    @ResponseBody
    public Object selectUser(){
        List<User> userList = userService.selectAll();
        return userList;
    }



}
