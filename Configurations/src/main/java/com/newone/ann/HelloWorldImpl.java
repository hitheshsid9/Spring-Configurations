package com.newone.ann;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldImpl implements HelloWorld {

	@Autowired
	private HelloIndia helloIndia;
	
	@Autowired
	private HelloCanada helloCanada;

	
public HelloCanada getHelloCanada() {
		return helloCanada;
	}

	public void setHelloCanada(HelloCanada helloCanada) {
		this.helloCanada = helloCanada;
	}

	public HelloIndia getHelloIndia() {
		return helloIndia;
	}

	public void setHelloIndia(HelloIndia helloIndia) {
		this.helloIndia = helloIndia;
	}

	public HelloWorldImpl() {
		super();
		
	}
	
	public HelloWorldImpl(HelloIndia helloIndia, HelloCanada helloCanada) {
		this.helloIndia = helloIndia;
		this.helloCanada = helloCanada;
	}

	public void printHelloWorld(String str) {

		System.out.println("hey " + str );

		helloIndia.printHelloIndia(str);
		
		helloCanada.printCanadMessage(str);

	}
}