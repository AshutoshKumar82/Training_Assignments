package com.example.demo;

import java.util.HashMap;
import java.util.Map;


public class MailService {

   private Map<String, String> map=null;
   
   public MailService() {
      map=new HashMap<>();
   }

   public void send(String mailTo){
      //Send mail code
      System.out.println("Inside send method - "+mailTo);
   }
   
   public void init() {
      map.put("host", "mail.example.com");
      map.put("port", "25");
      map.put("from", "example@xyz.com");
      System.out.println("Inside init method - "+map);
   }

   public void destroy() {
      map.clear();
      System.out.println("Inside destroy method - "+map);
   }
}