package com.kamalesh.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/kamalesh/spring/springcore/list/listconfig.xml");
		Hospital hp= (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital is "+ hp.getName());
		System.out.println("The deartments are ->" + hp.getDepartments()); 
		System.out.println(hp.getDepartments().getClass());
		

	}

}
