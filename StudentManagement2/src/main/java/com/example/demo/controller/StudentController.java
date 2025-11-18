package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudentManagement2Application;
import com.example.demo.service.SchoolStudentServiceImpl;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@GetMapping("fees")
	String printFees() {

	return ss.printFees();
	}

}
