package com.kclm.web.servlet.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet("/cookie")
public class cookieDemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //获取客户端的cookie
        Cookie[] cookies = req.getCookies();
        if(cookies == null){
            out.println("<h2>此时还没有针对此主机下的应用中的cookie</h2>");
        }else{
            //取出cookie
            for (Cookie c: cookies) {
                out.println(String.format("<p>CookieName:%s -> CookieValue:%s</p>",c.getName(),c.getValue()));
            }
        }
        //1.创建cookie对象
        Cookie c1 = new Cookie("zzj", "张志杰");
        Cookie c2 = new Cookie("random_number", String.valueOf(ThreadLocalRandom.current().nextInt(1000)));
        //给c2设置一些其他的属性值
        c2.setMaxAge(1 * 60 * 60);//一小时
        //把这两个 cookie 写到浏览器
        resp.addCookie(c1);
        resp.addCookie(c2);

        out.println("<h2>Cookie添加成功，请在浏览器中查看服务器端写过来的cookie</h2>");

        out.close();
    }
}
