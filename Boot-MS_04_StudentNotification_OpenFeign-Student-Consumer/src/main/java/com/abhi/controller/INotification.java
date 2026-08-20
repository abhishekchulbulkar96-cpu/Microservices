package com.abhi.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Notification-Service")
public interface INotification {
	
	@GetMapping("notification/service")
	public String showNotification();

}
