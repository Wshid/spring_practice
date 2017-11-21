package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		AdminConnection connection=ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println(connection.getAdminId());
		System.out.println(connection.getAdminPw());
		System.out.println(connection.getSub_adminId());
		System.out.println(connection.getSub_adminPw());
		
		ctx.close();
	}

}
