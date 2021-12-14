package web.servlet;

import com.kclm.servlet.dao.employeeDao;
import com.kclm.servlet.entity.employee;
import com.kclm.servlet.impl.employeeDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/emp/add")
public class EmployeeAdd extends HttpServlet {
    //导入持久层
    private employeeDao empdao;

    public EmployeeAdd() {
        this.empdao = new employeeDaoImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        String birth = req.getParameter("birth");
        String gender = req.getParameter("gender");
        String tel = req.getParameter("tel");
        //创建emp对象
        employee emp = new employee(name, LocalDate.parse(birth), gender, tel);
        //调用方法

//        req.getRequestDispatcher("/emp/add").forward(req,resp);
        try {
            empdao.addEmployee(emp);
        } catch (Exception e) {
            //
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "出异常了");
            return;
        }

    }
}
