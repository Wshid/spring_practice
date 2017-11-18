package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); // 스프링 컨테이너 생성(IOC)
		MyInfo myinfo=ctx.getBean("myInfo", MyInfo.class); // 스프링 컨테이너 로드 
		myinfo.getInfo();
		
		ctx.close();
		
		
	}
}
