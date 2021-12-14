package com.kclm.web.servlet.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/include")
public class includeDemoServletView extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //1.输出自己的内容前，先包含共用的头部
        req.getRequestDispatcher("commons/header.jsp").include(req,resp);
        //2.在输出自己的内容
        out.println("<h2>这是体部</h2>");
        out.println("<p>这是段落一</p>");
        out.println("<p>这是段落一</p>");
        out.println("<p>这是段落一</p>");
        out.println("<p>这是段落一</p>");
        out.println("<h3>结尾</h3>");
        //3.包含footer
        req.getRequestDispatcher("commons/footer.jsp").include(req,resp);
        //
        out.close();

    }
}
