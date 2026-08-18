package com.abhi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class EmployeeController {
	@GetMapping("/display")
	public String displayMessage() 
	{
		return "Hello From Employee Services";
	}

}
