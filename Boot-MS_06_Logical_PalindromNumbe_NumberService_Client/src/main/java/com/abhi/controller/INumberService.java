package com.abhi.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("Palindrome-Service")
public interface INumberService {
	@GetMapping("/palindrome/service/{num}")
	public String chekPolindome(@PathVariable int num);
	

}
