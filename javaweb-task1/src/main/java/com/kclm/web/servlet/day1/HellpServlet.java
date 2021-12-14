package com.kclm.web.servlet.day1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * @Description 第一个Servlet案例
 */
public class HellpServlet implements Servlet {

    //
    private ServletConfig config;

    public HellpServlet() {
        System.out.println("我是空参构造方法()....");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Hello Servlet init().....");
        //把容器传进来的ServletConfig赋值和给属性config
        this.config = config;
//        try {
//            System.out.println("模拟等待两秒");
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service()方法被容器调用了");
        //往客户端输出一些信息
//        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=utf-8");//告诉浏览器输出的是Html文档，并采用utf-8编码
        PrintWriter out = servletResponse.getWriter();
        out.println("<h2>欢迎学习Servlet</h2>");
        out.close();
    }

    @Override
    public String getServletInfo() {
        return "第一个Servlet";
    }

    @Override
    public void destroy() {
        System.out.println("被销毁了");
    }
}
