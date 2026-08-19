package com.abhi.rest;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentClientComponenet {
	
	@Autowired
	DiscoveryClient client; //come thrrought the autoconfiguration 
	
	public String getServiceInfo() 
	{

		//get all instances of PaymentService Producer
		List<ServiceInstance> listInst= client.getInstances("PaymentService-Producer");
		
		//take one from  the list of services which is present on listInst
		ServiceInstance instance = listInst.get(0);
		
		//get the Microservices uri make it url
		
		String url = instance.getUri()+"/payment/services"; //here getUri take the{uri = http://localhost:8888 +/payemet/services} make url
									///payment/services
		//rest gtemplete object 
		
		RestTemplate template = new RestTemplate();
		
		   @Nullable
		String resp = template.getForObject(url,String.class);
		   
		 return resp;
			
	}
	  
	  

}
