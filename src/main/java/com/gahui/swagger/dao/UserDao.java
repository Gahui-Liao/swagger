package com.gahui.swagger.dao;


import com.gahui.swagger.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> queryAllUser();

    User queryUserById(@Param("userId") long id);
}
