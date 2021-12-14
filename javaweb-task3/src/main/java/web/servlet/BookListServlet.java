package web.servlet;

import com.kclm.servlet.dao.employeeDao;
import com.kclm.servlet.entity.employee;
import com.kclm.servlet.impl.employeeDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/book/list")
public class BookListServlet extends HttpServlet {
    private employeeDao empdao;

    public BookListServlet(){
        this.empdao = new employeeDaoImpl();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取HttpSession
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession(false);
        if (session == null) {
            //肯定没有登陆
            System.out.println("此客户端肯定没有登陆过，因为Session为空");
            resp.sendRedirect(getServletContext().getContextPath() + "/login.jsp");
        } else {
            //进一步判断是否存在 LOGIN_USER_KEY
            if (session.getAttribute("LOGIN_USER_KEY") == null) {
                //说明，虽然存在Session，但是用户并没有登陆
                System.out.println("虽然有Session，但是并没有登陆");
                //如果用户没有登陆，则重定向到login.jsp中
                resp.sendRedirect(getServletContext().getContextPath() + "/login.jsp");
            } else {
                //如果用户是已经登陆了，则把请求转发到/WEB-INF/book/bookList.jsp资源中
                //说明登陆过
                List<employee> all = empdao.findAll();
                req.setAttribute("ALL_EMP",all);
                req.getRequestDispatcher("/WEB-INF/book/bookList.jsp").forward(req, resp);
            }
        }
    }
}
