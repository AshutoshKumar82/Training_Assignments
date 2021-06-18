package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
      
      MailService mailService1 = context.getBean(MailService.class);
      mailService1.send("abcd@example.com");

      MailService mailService2 = context.getBean(MailService.class);
      mailService2.send("xyz@example.com");

      context.close();
   }
}