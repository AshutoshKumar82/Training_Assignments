package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
		Question ques=factory.getBean(Question.class);
		ques.viewDetails();

	}

}