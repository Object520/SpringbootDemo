package com.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.User;


public interface IUserMapper extends BaseMapper<User> {

    User getUserById(Long id);

}
