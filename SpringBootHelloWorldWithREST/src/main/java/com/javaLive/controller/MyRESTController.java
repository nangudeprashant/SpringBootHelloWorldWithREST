package com.javaLive.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {
	@RequestMapping("/hello")
	public String home() {
	return "This project demonstrates how to use REST web services with Spring boot application.";
	}
	
	@RequestMapping("/result1")
	public String result1() {
	return "This project demonstrates how to use REST web services with Spring boot application.\nThis is result1.";
	}
	
	@RequestMapping("/result2")
	public String result2() {
	return "This project demonstrates how to use REST web services with Spring boot application.\nThis is result2.";
	}
}
