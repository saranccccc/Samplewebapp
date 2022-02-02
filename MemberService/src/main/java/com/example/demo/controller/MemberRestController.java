package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.runner.RegisterConsumer;

@RestController
@RequestMapping("/member")
public class MemberRestController {
	@Autowired
	RegisterConsumer consumer;
	
	@GetMapping("/register")
	public ResponseEntity<String> validatePayment() {
		System.out.println("member register Page");
		consumer.getRegister();
		return ResponseEntity.ok(	consumer.getRegister());
	}
	
	@GetMapping("/load")
	public ResponseEntity<String> load() {
		System.out.println("member register Page");
		consumer.getRegister();
		return ResponseEntity.ok(	consumer.getLoadBalancerClient());
	}
}
