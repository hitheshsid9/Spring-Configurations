package com.newone.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "helloWorld")
	public HelloWorldImpl helloWorld() {
		return new HelloWorldImpl();
	}
	
	@Bean(name = "helloIndia")
	public HelloIndia helloIndia() {
		return new HelloIndia();
	}
	
	@Bean(name = "helloCanada")
	public HelloCanada helloCanada() {
		return new HelloCanada();
	}

}
