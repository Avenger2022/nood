package org.com.it.Dao;

import java.sql.SQLException;

public interface UserName {
    //用户登录
    public void  LoginUser(String username,String password) throws SQLException;

}
