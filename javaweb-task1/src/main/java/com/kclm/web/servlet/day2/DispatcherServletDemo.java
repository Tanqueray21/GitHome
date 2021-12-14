package com.kclm.web.servlet.day2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tologin")
public class DispatcherServletDemo extends HttpServlet {
    //做转发的Servlet,不要往客户端输出任何内容
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入了DispatcherServletDemo的Service方法。。。");
        //获取requestDispatcher对象
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/login.jsp");
        System.out.println("开始服务端跳转....目的地Login.jsp");
        //跳转
        requestDispatcher.forward(req,resp);
    }
}
