package com.newone.ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
		
		//ApplicationContext cntxt = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("spring-context.xml"); 
		
		HelloWorld hl = (HelloWorld) cntxt.getBean("helloWorld");
		
		hl.printHelloWorld("guys");	
		
	}
}