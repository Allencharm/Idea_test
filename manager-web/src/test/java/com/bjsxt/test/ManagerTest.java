package com.bjsxt.test;

import com.bjsxt.service.mapper.UsersMapper;
import com.bjsxt.service.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/3/20
 * @Description: com.bjsxt.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("admin");

        this.usersMapper.insertUser(users);
    }
}
