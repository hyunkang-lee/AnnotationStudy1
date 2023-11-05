package com.ohgiraffers.employee.controller;

import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.dto.SelectDTO;
import com.ohgiraffers.employee.service.EmployeeService;
import com.ohgiraffers.employee.view.ResultView;

import java.util.List;

public class EmployeeController {
    public void selectAll() {
        ResultView resultView = new ResultView();
        EmployeeService employeeSirvice = new EmployeeService();
        List<SelectDTO> empList = employeeSirvice.selectAll();
        if (empList != null && empList.size() > 0 ){
            for (SelectDTO emp : empList){

                System.out.print(emp.getEmpName() + " / ");
                System.out.print(emp.getDepartment().getDepartmentTitle() + " / ");
                System.out.print(emp.getJob().getJobName() + " / ");
                System.out.print(emp.getEmpPhone() + " / ");
            }
        }else {
            System.out.println("조회 결과가 없습니다.");
        }
    }
}
