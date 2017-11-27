package com.meteorx.dao;

import com.meteorx.model.User;

public interface IUserDao {
    User selectUser(long id);
}
