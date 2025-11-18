package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SchoolStudentServiceImpl implements StudentService {

	@Override
	public String printFees() {
		// TODO Auto-generated method stub
		return "School Fess is 20K";
	}

	
	
	
}
