package com.abhi.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("Prime-Service")
public interface INumberService {
	
	@GetMapping("/prime/service/{num}")
	public String chekPrime(@PathVariable int num);

}
