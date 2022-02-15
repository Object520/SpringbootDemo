package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.User;
import com.example.mapper.IUserMapper;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, User> implements IUserService {

    @Override
    public User getUserById(Long id) {
        return baseMapper.getUserById(id);
    }
}
