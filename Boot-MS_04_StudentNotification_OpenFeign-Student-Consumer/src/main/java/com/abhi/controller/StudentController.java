package com.abhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	INotification notify;

			@GetMapping("/service")
		public ResponseEntity<String> callNotidication()
		{
			return new ResponseEntity<String> (notify.showNotification(),HttpStatus.OK);
			
		}
	
}
