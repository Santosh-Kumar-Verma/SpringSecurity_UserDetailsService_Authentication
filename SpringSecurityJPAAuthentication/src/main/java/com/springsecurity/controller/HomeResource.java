package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.dto.Employee;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String sayHello() {
		return "Welcome";
	}
	@GetMapping(value = "/user")
	public Employee user() {
		return new Employee(100l, "USER");
	}
	@GetMapping(value = "/admin")
	public Employee admin() {
		return new Employee(101l, "ADMIN");
	}
}
