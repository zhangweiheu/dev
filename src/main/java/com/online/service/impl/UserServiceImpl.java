package com.online.service.impl;

import com.online.mapper.UserMapper;
import com.online.model.User;
import com.online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhang on 2016/7/27.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
