package com.ohgiraffers.employee.dao;

import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

public class EmployeeProvider {

    public String selectAll() {


        return new SQL()
                .SELECT("a.emp_name")
                .SELECT("COALESCE((SELECT d.dept_title FROM department d WHERE d.dept_id = a.dept_code), '미배정') AS departmentTitle")
                .SELECT("c.job_name" )
                .SELECT("COALESCE(a.phone, '미지정') as phone")
                .FROM("employee a")
                .JOIN("job c ON a.job_code = c.job_code")
                .toString();
    }
}
