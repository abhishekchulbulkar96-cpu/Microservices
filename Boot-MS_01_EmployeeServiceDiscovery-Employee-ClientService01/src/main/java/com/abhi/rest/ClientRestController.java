package com.abhi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ClientRestController {
	@Autowired
	private ClientComponent component;

	@GetMapping("/client")
	public String getEmployeeData() {
		return component.getEmployeeData();
	}

}
