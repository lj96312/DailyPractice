package com.junlee.test.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// IUserService service = new UserServiceFactory().create();
		//
		// service.getDisPlayName("userGuid");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

		IUserService service = (IUserService) context.getBean("userservicedb");
		service.getDisPlayName("userGuid");

		IUserService service2 = (IUserService) context.getBean("userserviceredis");
		service2.getDisPlayName("userGuid");
	}
}
