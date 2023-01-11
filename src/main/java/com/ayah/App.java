package com.ayah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author AyahRefai
 *
 */
public class App {
    public static void main(String[] args) throws Exception {    	
        // start 
        ClassPathXmlApplicationContext app_context = new ClassPathXmlApplicationContext();
        
        Reading reading = (Reading) app_context.getBean("reading", Reading.class);
       
        reading.getReader().read();
        
        app_context.close();
        // end
    }
}
