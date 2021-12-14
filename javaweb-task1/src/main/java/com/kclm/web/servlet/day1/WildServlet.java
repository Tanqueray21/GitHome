package com.kclm.web.servlet.day1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/wildcard/*")
public class WildServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //资源名打出来
        String servletPath = req.getServletPath();
        String pathInfo = req.getPathInfo();
        //
        writer.println(String.format("<p>ServletPath:%s</p>",servletPath));
        writer.println(String.format("<p>PathInfo:%s</p>",pathInfo));
        //写一个响应头到浏览器
        resp.addHeader("zzj","FUCK");

        //通过请求来获取请求头的信息
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            //
            String s = headerNames.nextElement();
            //根据请求头的名字来取他的值
            String headerValue = req.getHeader(s);
            //输出到浏览器端
            writer.println(String.format("<p>%s => %s</p>", s, headerValue));
            writer.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
