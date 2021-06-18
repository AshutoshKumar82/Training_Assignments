package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Configuration
@PropertySource (name="application.properties", value="application.properties")
@ConfigurationProperties
public class dbConfig{


    @Value ("#{'${db.Drivername}'.split(',')}")
    private List<String> drivername;

    @Value ("#{'${db.Drivername}'.split(',')[0]}")
    private String firstdriverName;

    @Value ("${db.Url}")
    private List<String> driverurl;

    @Value ("#{${db.user}}")
    private Map<String, Integer> username;

    @Value ("#{${db.user}.two}")
    private String usernameTwo;

   
    @Value ("#{systemProperties['java.home']}")
    private String javaHome;

    @Value ("#{systemProperties['user.dir']}")
    private String userDir;


    @PostConstruct
    public void afterInitialize(){
        System.out.println(drivername);
        System.out.println(firstdriverName);
        System.out.println(driverurl);
        System.out.println(username);
        System.out.println(usernameTwo);
        System.out.println(javaHome);
        System.out.println(userDir);
    }
}