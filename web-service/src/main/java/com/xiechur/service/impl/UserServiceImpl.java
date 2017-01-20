package com.xiechur.service.impl;

import com.xiechur.dao.UserMapper;
import com.xiechur.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/1/19/019.
 */
//@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List selectAll() {
        return userMapper.selectAll();
    }
}
