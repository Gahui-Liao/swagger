package com.gahui.swagger.service;


import com.gahui.swagger.dao.UserDao;
import com.gahui.swagger.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public User queryUserById(long userId) {
        return userDao.queryUserById(userId);
    }
}
