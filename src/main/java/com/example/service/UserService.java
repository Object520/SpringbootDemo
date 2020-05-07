package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Description: 用户Service
* @Author: admin_Object
* @Date:  2020/5/6 19:59
*/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}