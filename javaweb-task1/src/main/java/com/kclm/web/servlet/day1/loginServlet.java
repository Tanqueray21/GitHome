package com.kclm.web.servlet.day1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名和密码
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        resp.setContentType("text/html;charset=utf-8");
        //checkBox代码
//        String parameter = req.getParameter("checkBox's name");
        System.out.printf("用户输入的信息有:%s %s\n", userName, passWord);
        if (userName.equals("admin")) {
            if (passWord.equals("123456")) {
                //说明用户名和密码正确,把此用户绑定到HttpSession范围
                HttpSession session = req.getSession();
                //
                session.setAttribute("LOGIN_USER_KEY", userName);
                //跳转/WEB-INF/book/bookList
                req.getRequestDispatcher("/WEB-INF/book/bookList.jsp").forward(req, resp);
            } else {
                //说明密码出错了
                System.out.println("密码错误！");
                //先绑定数据
                req.setAttribute("PASSWD_ERROR", "密码不正确");
                //转发到login.jsp
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
//                out.println("<script type='javascript'> alert('密码错误!');</script>");
            }
        } else {
            //说明用户名错了
            System.out.println("用户名错误！");
//            out.println("<script type='javascript'> alert('用户名错误!');</script>");
            //绑定数据
            req.setAttribute("USERNAME_ERROR", "用户名不正确");
            //转发
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
