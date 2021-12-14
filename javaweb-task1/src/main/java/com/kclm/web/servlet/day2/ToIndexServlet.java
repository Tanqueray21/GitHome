package com.kclm.web.servlet.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/toIndex")
public class ToIndexServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        System.out.println("发生了重定向,位置:index.jsp");
        //重定向
        String type = req.getParameter("type");
        if (type == null) {
            resp.sendRedirect("index.jsp");
        }else if(type.equals("405")){
            //发送错误码页面
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }else if(type.equals("403")){
            resp.sendError(HttpServletResponse.SC_FORBIDDEN,"不允许你访问");
        }

    }
}
