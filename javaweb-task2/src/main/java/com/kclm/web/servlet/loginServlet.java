package com.kclm.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("ID");
        String name = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        System.out.printf("用户输入的信息有:%s %s  %s\n", id, name, passWord);

        PrintWriter writer = resp.getWriter();
        if (id.equals("29")) {
            if (name.equals("张三丰")) {
                if (passWord.equals("123456")) {
                    writer.println("<h2>欢迎"+id+"号同学"+ name + "学习Servlet！");
                } else {
                    writer.println("<h2>密码错误</h2>");
                }
            } else {
                writer.println("<h2>用户名错误!</h2>");
            }
        } else {
            writer.println("<h2>ID错误!</h2>");
        }

        writer.close();


    }
}

