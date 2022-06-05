package org.com.it.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static  String user;
    private static  String password;
    private static  String driver;
    static {

        try {
            //读资源文件
            //1.创建Properties集合类
            Properties pro = new Properties();
            //获取src路径下的文件的方式 - 类加载器：
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("db.properties");
            String path = res.getPath();
            //加载文件
            pro.load(new FileReader(path));

            //获取数据 赋值
            url = pro.getProperty("db.url");
            user = pro.getProperty("db.name");
            password = pro.getProperty("db.password");
            driver = pro.getProperty("db.driver");

            Class.forName(driver);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    /***
     * 获取连接
     *
     * 文件的读取 只需要读取一次即可拿到这些值 使用静态代码块
     * @return
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源
     * @param stmt
     * @param conn
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
