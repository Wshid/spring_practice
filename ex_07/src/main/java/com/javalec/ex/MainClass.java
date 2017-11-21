package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student s1=ctx.getBean("student1", Student.class);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		Student s2=ctx.getBean("student1", Student.class);
		s2.setAge("30");
		s2.setName("이름2");
		
		if(s1.equals(s2)) {
			System.out.println("EQUAL");
		}else {
			System.out.println("DIFF");
		}
	}
}
