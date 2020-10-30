package com.javaLive.SpringBootNewHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.javaLive.controller.MyRESTController;

@SpringBootApplication
@ComponentScan(basePackageClasses = MyRESTController.class)
public class SpringBootNewHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNewHelloWorldApplication.class, args);
	}

}
