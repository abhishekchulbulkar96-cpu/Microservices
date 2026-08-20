package com.abhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prime")
public class PrimeService {
	
	@GetMapping("/service/{num}")
	public String chekPrime(@PathVariable int num) 
	{
		 if (num <= 1) {
	            return num + " is Not a Prime Number";
	        }

	        for (int i = 2; i <= Math.sqrt(num); i++) {

	            if (num % i == 0) {
	                return num + " is Not a Prime Number";
	            }
	        }

	        return num + " is a Prime Number";
	    }
	
	}


