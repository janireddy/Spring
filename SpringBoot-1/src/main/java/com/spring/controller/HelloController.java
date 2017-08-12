package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jani")
public class HelloController {
	public String welcome() {
		return "welcome to github";
	}
}
