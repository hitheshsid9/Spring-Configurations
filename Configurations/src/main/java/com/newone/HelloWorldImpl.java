package com.newone;

public class HelloWorldImpl implements HelloWorld {

	private HelloIndia helloIndia;
	
	private HelloCanada helloCanada;
	
	public HelloWorldImpl(HelloIndia helloIndia,HelloCanada helloCanada) {
		this.helloIndia = helloIndia;
		this.helloCanada = helloCanada;
	}

	/*public HelloIndia getHelloIndia() {
		return helloIndia;
	}

	public void setHelloIndia(HelloIndia helloIndia) {
		this.helloIndia = helloIndia;
	}*/

	/*public HelloWorldImpl() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	public void printHelloWorld(String str) {

		System.out.println("hey " + str);

		helloIndia.printHelloIndia(str);
		
		helloCanada.printCanada(str);

	}
}