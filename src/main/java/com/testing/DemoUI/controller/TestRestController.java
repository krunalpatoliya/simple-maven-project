package com.testing.DemoUI.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)	
	public String getHelloWorld() {
		return "HelloWorld...!";
	}
}
