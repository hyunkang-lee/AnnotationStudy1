package com.ohgiraffers.employee.dao;

import com.ohgiraffers.employee.dto.SelectDTO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface EmployeeMapper {
     @Results(id="selectResultMap", value = {
             @Result(id = true, property = "empId", column = "emp_id"),
             @Result(property = "empName", column = "emp_name"),
             @Result(property = "empNo", column = "emp_no"),
             @Result(property = "empEmail", column = "email"),
             @Result(property = "empPhone", column = "phone"),
             @Result(property = "department", column = "SELECT d.dept_title FROM department d WHERE d.dept_id = employee.dept_code"),
             @Result(property = "jobName", column = "SELECT c.job_name FROM job c WHERE c.job_code = employee.job_code")
     })
     @SelectProvider(type = EmployeeProvider.class, method = "selectAll")
     List<SelectDTO> selectAll();
}

