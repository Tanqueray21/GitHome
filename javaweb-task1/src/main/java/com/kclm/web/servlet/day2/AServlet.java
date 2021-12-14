package com.kclm.web.servlet.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/a")
public class AServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //模拟一个集合对象
        List<String> list = Arrays.asList("Movie", "Game", "Coding", "Music", "Read");
        //把它绑定到request范围和session范围
        req.setAttribute("LIST_KEY",list);
        //
        req.getSession().setAttribute("LIST_KEY",list);
        //根据请求参数redirect的值来决定是转发还是重定向
        String redirect = req.getParameter("redirect");
        if (redirect!=null&& redirect.equals("true")){
            //重定向,加上应用名
            resp.sendRedirect(getServletContext().getContextPath()+"/b");
        }else{
            //转发
            req.getRequestDispatcher("/b").forward(req,resp);
        }



    }
}
