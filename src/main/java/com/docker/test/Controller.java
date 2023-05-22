package com.docker.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String getValue() {
		return "Controller fired";
	}

}
