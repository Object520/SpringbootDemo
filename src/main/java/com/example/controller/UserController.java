package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.entity.User;
import com.example.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Description: 用户Controller
* @Author: admin_Object
* @Date:  2020/5/6 19:57
*/
@RestController
@AllArgsConstructor
public class UserController {

    private final IUserService iUserService;

    @RequestMapping("/testBoot/getUser/{id}")
    public String GetUser(@PathVariable Long id){
        User user = iUserService.getUserById(id);
        return JSON.toJSONString(user);
    }
}