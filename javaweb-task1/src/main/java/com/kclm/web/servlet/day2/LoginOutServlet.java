package com.kclm.web.servlet.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LoginOutServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Session
        HttpSession session = req.getSession();
        //调用Session的 invalidate方法
        session.invalidate();//使会话Session失效，并解绑所有绑定在此Session上的对象
        //指定目的地
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }
}
