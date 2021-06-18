package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ApplicationContextAwareImpl getApplicationContextAwareImplBean() {
        return new ApplicationContextAwareImpl();
    }

    @Bean
    public BeanFactoryAwareImpl getBeanFactoryAwareImplBean() {
        return new BeanFactoryAwareImpl();
    }

    @Bean("beanNameAware")
    public BeanNameAwareImpl getBeanNameAwareImplBean() {
        return new BeanNameAwareImpl();
    }

    @Bean(name = "user")
    public User getUserBean() {
        return new User(1, "Imneet");

    }
}