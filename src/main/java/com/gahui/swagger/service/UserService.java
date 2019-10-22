package com.gahui.swagger.service;

import com.gahui.swagger.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();
    User queryUserById(long userId);
}
