package com.ohgiraffers.employee.service;

import com.ohgiraffers.employee.dao.EmployeeMapper;
import com.ohgiraffers.employee.dto.SelectDTO;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {

    public List<SelectDTO> selectAll() {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<SelectDTO> empList = mapper.selectAll();

        sqlSession.close();

        return empList;
    }
}
