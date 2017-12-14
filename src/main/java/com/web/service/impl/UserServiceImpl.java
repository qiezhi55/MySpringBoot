package com.web.service.impl;

import com.web.mapper.UserMapper;
import com.web.model.User;
import com.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lj on 2017/12/14.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Resource
    private UserMapper userMapper;
    @Override
    @Transactional
    public User getUser(String id) {
        User user= userMapper.selectByPrimaryKey(Integer.parseInt(id));
        return user;
    }
}
