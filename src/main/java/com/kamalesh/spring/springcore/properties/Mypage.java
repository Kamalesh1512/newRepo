package com.kamalesh.spring.springcore.properties;

public class Mypage {

	private String url;
	
	public Mypage(String url) {
		this.url=url;
	}

	@Override
	public String toString() {
		return "Mypage [url=" + url + "]";
	}
	
}
