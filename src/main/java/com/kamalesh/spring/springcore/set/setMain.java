package com.kamalesh.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/kamalesh/spring/springcore/set/setconfig.xml");
		CarDealer carDealers = (CarDealer) ctx.getBean("Cardealer");
		System.out.println(carDealers.getName());
		System.out.println("The models of Cars ->" + carDealers.getModels());
		System.out.println(carDealers.getModels().getClass());
		ctx.close();

	}

}
