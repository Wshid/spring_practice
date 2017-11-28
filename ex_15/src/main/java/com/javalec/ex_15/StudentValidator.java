package com.javalec.ex_15;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		System.out.println("validate()");
		Student student = (Student) arg0;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "name", "trouble value");
		
		int studentId=student.getid();
		if(studentId==0) {
			System.out.println("StudentId is 0");
			arg1.rejectValue("id", "is zero");
		}
	}

}
