package com.example.mapper;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

/**
* @Description: 用户Mapper
* @Author: admin_Object
* @Date:  2020/5/6 20:00
*/
@Repository
public interface UserMapper {

    User getUserById(int id);
}