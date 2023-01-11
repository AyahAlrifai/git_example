package com.ayah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        Reading reading = (Reading) context.getBean("reading", Reading.class);
       
        reading.getReader().read();

        context.close();
    }
}
