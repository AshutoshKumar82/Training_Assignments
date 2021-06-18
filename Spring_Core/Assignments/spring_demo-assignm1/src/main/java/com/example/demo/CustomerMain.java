package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Appconfig.CustomerConfig;

public class CustomerMain {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		Customer obj=(Customer)context.getBean("customer");
		obj.customerDetails();
	}

}
