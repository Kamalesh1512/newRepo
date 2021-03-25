package com.kamalesh.spring.springcore.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDep {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/kamalesh/spring/springcore/dependency/depconfig.xml");
		University obj1 = (University) ctx.getBean("university");
		System.out.println(obj1);

		University obj2= (University) ctx.getBean("university");
		System.out.println(obj2);

	}

}
