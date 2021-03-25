package com.kamalesh.spring.springcore.assign;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/kamalesh/spring/springcore/assign/assignconfig.xml");
		 ShoppingCart shop = (ShoppingCart) ctx.getBean("ShoppingCart");
		System.out.println(shop);
		

	}

}
