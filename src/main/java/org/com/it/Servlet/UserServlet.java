package org.com.it.Servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        //设置编码格式
        request.setCharacterEncoding("utf-8");
        //获取请求数据
        response.setContentType("text/html;charset=utf-8");
        //处理数据

        //响应数据
              //请求转发
              //重定向
    }
}
