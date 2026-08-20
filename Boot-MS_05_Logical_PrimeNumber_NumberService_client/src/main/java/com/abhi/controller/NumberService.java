package com.abhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
public class NumberService {
@Autowired
INumberService serv;	
	
    @GetMapping("/service/{num}")
	public String chekNumber(@PathVariable int num) 
	{
	return	serv.chekPrime(num);
	}
	
}
