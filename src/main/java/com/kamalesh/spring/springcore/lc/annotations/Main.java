package com.kamalesh.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/kamalesh/spring/springcore/lc/annotations/annotationconfig.xml");
		TicketReservations Tr = (TicketReservations) ctx.getBean("TicketReservations");
		System.out.println(Tr);
		ctx.registerShutdownHook();


	}

}
