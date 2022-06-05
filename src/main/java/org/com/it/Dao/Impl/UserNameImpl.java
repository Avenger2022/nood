package org.com.it.Dao.Impl;

import org.com.it.Dao.UserMapper;
import org.com.it.pojo.User;

import java.sql.*;

public class UserNameImpl implements UserMapper {
    //用户登录
    @Override
    public User LoginUser(String username, String password) {
        Connection conn=null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        User user=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cape");//连接数据库
            String sql="select from zb_user where username=? and password=?";//sql语句
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);//设置占位符中第一个值
            ps.setString(2,password);//设置占位符中第二值
            rs= ps.executeQuery();//执行sql
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
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return user;
    }
    //注册方法
    @Override
    public int register(User user) {
        Connection conn=null;
        PreparedStatement ps =null;
        int index=-1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cape");
            String sql="insert  into zb_user values (default,?,?,?,?,?,?,?,?,?,? )";
            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getSex());
            ps.setString(4,user.getEmail());
            ps.setString(5,user.getIphone());
            ps.setString(6, user.getName());
            ps.setInt(7,user.getAge());
            ps.setString(8,user.getAddress());
            ps.setString(9,user.getRelationship());
            ps.setString(10,user.getBirth());
            index=ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    return  index;
    }
}
