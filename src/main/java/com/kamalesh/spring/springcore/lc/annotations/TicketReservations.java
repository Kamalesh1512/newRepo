package com.kamalesh.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservations {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void intialize() {
		System.out.println("inside intialize method");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("inside cleanUp method");
	}

	@Override
	public String toString() {
		return "TicketReservations [id=" + id + "]";
	}
	

}
