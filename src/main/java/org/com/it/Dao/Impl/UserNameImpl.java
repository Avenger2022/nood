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
            String sql="select from zb_user where username=? and password=?";//缺少表名bvc
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs= ps.executeQuery();
            while (rs.next()){
                user=new User();
                user.setUid(rs.getInt("Uid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setSex(rs.getString("sex"));
                user.setEmail(rs.getString("email"));
                user.setIphone(rs.getString("iphone"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setRelationship(rs.getString("relationship"));
                user.setBirth(rs.getString("birth"));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }
}
