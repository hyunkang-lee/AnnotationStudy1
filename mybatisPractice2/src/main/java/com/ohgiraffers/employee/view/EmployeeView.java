package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.controller.EmployeeController;
import com.ohgiraffers.employee.service.EmployeeService;

import java.util.Scanner;

public class EmployeeView {

    public void displayView() {

        /*
        ============ 직원 관리 ====================
        1. 직원전체조회
        2. 직원 이름 또는 id로 직원조회
        3. 부서명으로 검색
        4. 직급으로 검색
        5. 신규 부서 생성
        6. 신규 직원 생성
        7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)
        8. 직원퇴사
        ==========================================
        상세 내용은 pdf를 참고
        */

        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        EmployeeService employeeSirvice = new EmployeeService();
        do {
            System.out.println("============ 직원 관리 ====================");
            System.out.println("1. 직원전체조회");
            System.out.println("2. 직원 이름 또는 id로 직원조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)");
            System.out.println("8. 직원퇴사");
            System.out.println("0. 프로그램 종료");
            System.out.println("==========================================");
            System.out.print("원하는 프로그램을 선택해주세요 : ");

            int no = sc.nextInt();
            switch (no){
                case 1 : employeeController.selectAll(); break;
//                case 2 : employeeController.selectInfoByIdAndName(inputSearchDTO()); break;
//                case 3 : employeeController.selectInfoByDeptTitle(inputDeptTitle()); break;
//                case 4 : employeeController.selectInfoByJobName(inputJobName()); break;
//                case 5 : employeeSirvice.insertNewDept(inputDeptInfo()); break;
//                case 6 : employeeSirvice.insertNewEmp(inputEmpInfo()); break;
//                case 7 : employeeSirvice.modifyEmp(inputModifyEmp()); break;
//                case 8 : employeeSirvice.deleteEmp(inputEmpId()); break;
                case 0 : return;
            }
        }while (true);

    }
}
