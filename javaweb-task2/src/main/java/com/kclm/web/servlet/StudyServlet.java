package com.kclm.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyWeb/StudyServlet.do")
public class StudyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        System.out.println("请求参数ID的值:"+id);
        String username = req.getParameter("username");
        System.out.println("请求参数username的值:"+username);
        String password = req.getParameter("password");
        System.out.println("请求参数password的值:"+password);
        //
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        if(id != null){
            writer.println("<h2>ID的值是:"+id+"</h2>");
        }else{
            writer.println("<h2>你没有给定请求参数name</h2>");
        }
        if (username != null){
            writer.println("<h2>username的值是:"+username+"</h2>");
        }else{
            writer.println("<h2>你没有给定请求参数username</h2>");
        }

        if (password !=null){
            writer.println("<h2>password的值是:"+password+"</h2>");
        }else {
            writer.println("<h2>你没有给定请求参数passwrod</h2>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        doGet(req, resp);
    }
}
