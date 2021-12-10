package com.kclm.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * Httpservlet的案例
 */
@WebServlet(urlPatterns = {"/MyWeb/HelloServlet"})
public class HelloHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("浏览器端发送了get请求");
        //获取浏览器端得信息，主要是请求的信息
        String name = req.getParameter("name");
        System.out.println("请求参数 name的值是：" + name);
        //向客户端输出
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
//        if (name != null) {
//            writer.println("<h3>你输入的名字是:" + name + "</h3>");
//        }else{
//            writer.println("<h2>你没有给定请求参数name</h2>");
//        }
        writer.println("欢迎学习Servlet!");
        //
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("浏览器发送了post请求到此方法");
    }
}
