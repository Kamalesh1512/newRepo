package com.kamalesh.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/kamalesh/spring/springcore/properties/config.xml");
		Mypage pg = (Mypage) ctx.getBean("My");
		System.out.println(pg);

	}

}
