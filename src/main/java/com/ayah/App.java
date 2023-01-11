package com.ayah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
    	System.out.println("start");
    	
        ClassPathXmlApplicationContext app_context = new ClassPathXmlApplicationContext();
        
        Reading reading = (Reading) app_context.getBean("reading", Reading.class);
       
        reading.getReader().read();
        
        app_context.close();
        
        System.out.println("end");
    }
}
