package com.abhi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment") //global path
public class PayementController {
	@GetMapping("/service")				//method path
	public String DisplayMessge() 
	{
		return "Payment Service is running successfully";
	}

}
