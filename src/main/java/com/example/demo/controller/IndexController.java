package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author will
 *
 */
@RestController
public class IndexController {

	@GetMapping("/hello")
	public String index() {
		return "Hello World";
	}
}