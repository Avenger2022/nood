package org.com.it.Dao.Impl;

import org.com.it.Dao.UserName;
import org.com.it.pojo.User;

import java.sql.*;

public class UserNameImpl implements UserName {
    //用户登录
    @Override
    public void LoginUser(String username, String password) throws SQLException {
        Connection conn=null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        User user=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cape");
            String sql="select from  where username=? and password=?";//缺少表名
            ps=conn.prepareStatement(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
