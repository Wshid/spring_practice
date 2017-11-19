package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("swim");
		hobbys.add("cook");
		
		Student student=new Student("name1", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys=new ArrayList<String>();
		hobbys.add("reading");
		hobbys.add("listening");
		
		Student student = new Student("hong", 18, hobbys);
		student.setHeight(30);
		student.setWeight(5);
		
		return student;
	}

}
