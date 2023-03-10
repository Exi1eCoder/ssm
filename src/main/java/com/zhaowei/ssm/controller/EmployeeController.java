package com.zhaowei.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhaowei.ssm.pojo.Employee;
import com.zhaowei.ssm.service.EmployeeService;

/**
 * test git
 * 查询所有的员工信息-->/employee-->get
 * 根据id查询员工信息-->/employee/1-->get
 * 跳转到添加页面-->/to/add-->get
 * 添加员工信息-->/employee-->post
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getAllEmployee(Model model) {
		//查询所有的员工信息
		List<Employee> list = employeeService.getAllEmployee();
		//将员工信息在请求域中共享
		model.addAttribute("list", list);
		//跳转到employee_list.html
		return "employee_list";
	}
}
