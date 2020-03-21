package com.bjsxt.service.impl;

import com.bjsxt.service.UsersService;
import com.bjsxt.service.mapper.UsersMapper;
import com.bjsxt.service.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/3/21
 * @Description: com.bjsxt.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceimpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
