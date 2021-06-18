package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties (EmployeeConfig.class)
@SpringBootApplication
public class Application7 extends SpringDemoAssignm7Application {

    public static void main(String[] args) {
        SpringApplication.run(Application7.class, args);
    }

}