package com.meteorx.service.impl;

import com.meteorx.dao.IUserDao;
import com.meteorx.model.User;
import com.meteorx.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
