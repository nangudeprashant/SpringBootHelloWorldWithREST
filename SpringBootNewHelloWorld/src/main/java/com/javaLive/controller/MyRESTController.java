package com.javaLive.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {
	@RequestMapping("/hello")
	public String home() {
	return "Spring boot is working!";
	}
	
	@RequestMapping("/result1")
	public String result1() {
	return "Spring boot is working!\nThis is result1.";
	}
	
	@RequestMapping("/result2")
	public String result2() {
	return "Spring boot is working!\nThis is result2.";
	}
}
