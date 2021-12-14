package com.kclm.web.servlet.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/b")
public class BServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //1.从req范围取出数据
        Object key =  req.getAttribute("LIST_KEY");
        //判断
        if(key!=null){
            List<String> list = (List<String>) key;
            writer.println("<h3>请求范围中的数据是:</h3>");
            list.forEach((e) -> {
                writer.println("<p>"+e+"</p>");
            });
        }
        //2.从session范围中取出数据
        List<String> list = (List<String>) req.getSession().getAttribute("LIST_KEY");
        //打印出来
        writer.println("<h3>Session范围中的数据是:</h3>");
        list.forEach((e) -> {
            writer.println("<p>"+e+"</p>");
        });
        //
        writer.close();


    }
}
