package com.zhaowei.ssm.mapper;

import java.util.List;

import com.zhaowei.ssm.pojo.Employee;

public interface EmployeeMapper {

	/**
	 * 查询所有的员工信息
	 * @return
	 */
	List<Employee> getAllEmployee();

}
