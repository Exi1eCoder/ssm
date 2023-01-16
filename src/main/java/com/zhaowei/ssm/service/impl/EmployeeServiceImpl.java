package com.zhaowei.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhaowei.ssm.mapper.EmployeeMapper;
import com.zhaowei.ssm.pojo.Employee;
import com.zhaowei.ssm.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeMapper.getAllEmployee() ;
	}

}
