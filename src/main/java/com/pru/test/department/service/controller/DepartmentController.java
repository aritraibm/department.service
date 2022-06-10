package com.pru.test.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pru.test.department.service.entity.Department;
import com.pru.test.department.service.repo.DepartmentRepo;

@RestController
@RequestMapping(value = "/pru-dept")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepo deptRepo;
	
	@PostMapping(value = "/save-dept")
	public Department saveDept(@RequestBody Department formData) {
		
		return deptRepo.save(formData);
	}
	
	@GetMapping(value = "/get-dept/{deptId}")
	public Department getDept(@PathVariable Long deptId) {
		
		return deptRepo.findByDeptId(deptId);
	}

}
