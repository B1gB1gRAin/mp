package com.bigbigrain.mp4.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import com.bigbigrain.mp4.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author weiyunhui
 * @since 2018-06-21
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService; 
	
//	public String  login() {
//		
//		//employeeService.select
//	}
}

