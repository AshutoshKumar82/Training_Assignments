package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
   @Bean(initMethod="init",destroyMethod="destroy")
   public MailService getMailService() {
      return new MailService();
   }
}