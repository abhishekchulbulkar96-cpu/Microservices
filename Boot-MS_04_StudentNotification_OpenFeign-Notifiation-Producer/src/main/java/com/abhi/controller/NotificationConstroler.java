package com.abhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationConstroler {

	@GetMapping("/service")
	public String send() 
	{
		return "Notification Service is working successfully";
	}
		
}
