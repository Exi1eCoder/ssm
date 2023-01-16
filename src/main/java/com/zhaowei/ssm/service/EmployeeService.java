package com.zhaowei.ssm.service;

import java.util.List;

import com.zhaowei.ssm.pojo.Employee;

public interface EmployeeService {
	/**
	 * 查询所有的而员工信息
	 * @return
	 */
	List<Employee> getAllEmployee();

}
