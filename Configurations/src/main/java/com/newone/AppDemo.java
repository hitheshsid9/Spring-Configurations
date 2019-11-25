package com.newone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
		
		ApplicationContext cntxt = new AnnotationConfigApplicationContext(AppConfig.class); 
		
		HelloWorld hl = (HelloWorld) cntxt.getBean("helloWorld");
		
		hl.printHelloWorld("annotation");	
		
	}
}