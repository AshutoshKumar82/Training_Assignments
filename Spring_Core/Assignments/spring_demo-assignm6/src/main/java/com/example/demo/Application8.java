package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties (dbConfig.class)
@SpringBootApplication
public class Application8 extends SpringDemoAssignm6Application {

    public static void main(String[] args) {
        SpringApplication.run(Application8.class, args);
    }

}