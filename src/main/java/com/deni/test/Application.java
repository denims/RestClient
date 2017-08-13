package com.deni.test;

import org.springframework.web.client.RestTemplate;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate template = new RestTemplate();
		Values values = template.getForObject("http://localhost:8080/greeting", Values.class);
		System.out.println(values);
	}

}
