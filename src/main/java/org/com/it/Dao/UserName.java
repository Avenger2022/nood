package org.com.it.Dao;

import org.com.it.pojo.User;

import java.sql.SQLException;

public interface UserName {
    //用户登录
    public User LoginUser(String username, String password) ;

    public static void main(String[] args) {
        System.out.println("请多多关照");
    }
}
