package com.bjsxt.web.controller;

import com.bjsxt.service.UsersService;
import com.bjsxt.service.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/3/21
 * @Description: com.bjsxt.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/addUser")
    public String sddUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }
}
