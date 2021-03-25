package com.kamalesh.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/kamalesh/spring/springcore/reftypes/reftypeconfig.xml");
		Student std= (Student) ctx.getBean("Student");
		System.out.println(std);
		

	}

}
