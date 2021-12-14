package com.kclm.servlet.impl;

import com.kclm.servlet.JDBCTemplate.JdbcTemplate;
import com.kclm.servlet.dao.employeeDao;
import com.kclm.servlet.entity.employee;


import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class employeeDaoImpl implements employeeDao {

    private JdbcTemplate template = new JdbcTemplate();

    @Override
    public List<employee> findAll() {
        return template.queryList((conn) -> {
            String sql = "select * from t_employee";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt;
        }, (rs) -> {
            List<employee> emp = new ArrayList<>();
            while (rs.next()){
                Integer emp_id = rs.getInt("id");
                String emp_name = rs.getString("name");
                LocalDate emp_birth = rs.getDate("birthday").toLocalDate();
                String emp_gender = rs.getString("gender");
                String emp_tel = rs.getString("tel");
                emp.add(new employee(emp_id,emp_name,emp_birth,emp_gender,emp_tel));
            }
            return emp;
        });
    }

    @Override
    public void addEmployee(employee emp) {
        template.update((conn) -> {
            String sql = "insert into t_employee(id,name,birthday,gender,tel) values(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, emp.getId());
            pstmt.setObject(2, emp.getName());
            pstmt.setObject(3, emp.getBirthday());
            pstmt.setObject(4, emp.getGender());
            pstmt.setObject(5, emp.getTel());
            return pstmt;
        });
    }


}
