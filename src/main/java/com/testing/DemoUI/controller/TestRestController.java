package com.testing.DemoUI.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)	
	public String getHelloWorld() {
		System.out.println("hi");
		return "HelloWorld...!";
	}
	@RequestMapping(value = "/gethello", method = RequestMethod.GET)	
	public String getHello() {
		return "HelloWorld...!";
	}
	@RequestMapping(value = "/getRead", method = RequestMethod.GET)	
	public String getRead() {
		return "Hi Read!";
	}
}
