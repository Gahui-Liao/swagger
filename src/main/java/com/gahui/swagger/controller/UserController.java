package com.gahui.swagger.controller;

import com.gahui.swagger.entity.User;
import com.gahui.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "用户管理层",tags = "获取用户信息")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @ApiOperation(value = "获取用户信息",notes = "根据用户ID获取用户信息")
    @RequestMapping(value = "/queryUserById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public User queryUserById(@PathVariable("id") long userId){
        return userService.queryUserById(userId);
    }

    @ApiOperation(value = "获取用户信息",notes = "获取所有用户信息")
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
//    @GetMapping(value = "/queryAll")
    @ResponseBody
    public List<User> queryAll(){
        return userService.queryAllUser();
    }

}
