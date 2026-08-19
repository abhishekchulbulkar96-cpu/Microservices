package com.abhi.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ServiceController {
	@Autowired
	PaymentClientComponenet comp;
	
	@GetMapping("/services")
	public String showAllServices()
	{
		 
		return comp.getServiceInfo();
		 
		
	}

}
