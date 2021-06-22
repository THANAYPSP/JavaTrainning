package com.example.hellorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloRestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
				= SpringApplication.run(HelloRestApplication.class, args);
		String[] objects = context.getBeanDefinitionNames();
		for (String object : objects) {
			System.out.println(object);
		}
        int count = context.getBeanDefinitionCount();
        System.out.println("Total : " + count);

    }

}
