package com.kclm.web.servlet.day1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.action")
public class SuffixServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户请求的信息
        //1.主机地址
        String remoteAddr = req.getRemoteAddr();
        //2.主机端口
        int serverPort = req.getServerPort();
        int localPort = req.getLocalPort();
        //3.应用名
        String contextPath = req.getServletContext().getContextPath();
        String contextPath1 = getServletContext().getContextPath();
        String contextPath2 = getServletConfig().getServletContext().getContextPath();
        //4.资源名
        String servletPath = req.getServletPath();
        //把以上4个东西打印输出到前端浏览器上
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //
        writer.println(String.format("<p>主机：%s</p>",remoteAddr));
        writer.println(String.format("<p>servlet端口：%d</p>",serverPort));
        writer.println(String.format("<p>local端口：%d</p>",localPort));
        writer.println(String.format("<p>应用名：%s</p>",contextPath));
        writer.println(String.format("<p>应用名：%s</p>",contextPath1));
        writer.println(String.format("<p>应用名：%s</p>",contextPath2));
        writer.println(String.format("<p>资源名:%s</p>",servletPath));
        //

        writer.close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
