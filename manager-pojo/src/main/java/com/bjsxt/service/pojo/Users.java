package com.bjsxt.service.pojo;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2020/3/20
 * @Description: com.bjsxt.pojo
 * @version: 1.0
 */
public class Users {
    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
