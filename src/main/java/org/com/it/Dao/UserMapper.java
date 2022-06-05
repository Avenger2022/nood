package org.com.it.Dao;

import org.apache.ibatis.annotations.Param;
import org.com.it.pojo.User;

import java.sql.SQLException;

public interface UserMapper {
    //用户登录
     User LoginUser(@Param("username") String username,@Param("password") String password) ;
    //用户注册
      int register(User user);
}
