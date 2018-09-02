package com.urosht.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

	@GetMapping("/hello")
	public String helloController(@RequestParam String name) {
		log.info("Handle request: Say hello: {}", name);
		return "Hello " + name;
	}
}
