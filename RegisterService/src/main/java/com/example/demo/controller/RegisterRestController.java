package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class RegisterRestController {
	@GetMapping("/validate")
	public ResponseEntity<String> validatePayment() {
		System.out.println("Payment Page");
		return ResponseEntity.ok("PAYMENT SUCCESS!");
	}
}
