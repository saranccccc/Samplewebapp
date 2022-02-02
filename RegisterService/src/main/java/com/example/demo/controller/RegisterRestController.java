package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterRestController {
	@Value("${server.port}")
	private String port;
	@GetMapping("/member")
	public ResponseEntity<String> validatePayment() {
		System.out.println("register Page "+RegisterRestController.class.getName());
		return ResponseEntity.ok("register member SUCCESS :) from port "+port);
	}
}
