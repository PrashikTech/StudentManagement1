package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class CollegeStudentServiceImpl implements StudentService {

	@Override
	public String printFees() {
		// TODO Auto-generated method stub
		return "College Fees is 3 Lakh";
	}

	
	
}
