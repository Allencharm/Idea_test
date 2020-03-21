package com.bjsxt.service.mapper;

import com.bjsxt.service.pojo.Users;

import java.util.List;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/3/20
 * @Description: com.bjsxt.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
