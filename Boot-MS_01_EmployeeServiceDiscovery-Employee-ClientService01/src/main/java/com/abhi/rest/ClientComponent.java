package com.abhi.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ClientComponent {
	
	@Autowired
	DiscoveryClient client;
	
	
	public String getEmployeeData() {
		
	
		List<ServiceInstance> instance = client.getInstances("Employee-Service");
		
		ServiceInstance instance2 = instance.get(0);
		
		//employee service url
		
		String url= instance2.getUri()+"/search/display";
		
		//call employee service
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> exchange = template.exchange(url,HttpMethod.GET,null,String.class);
		return exchange.getBody();
		
	}
	
	
	
  
}
