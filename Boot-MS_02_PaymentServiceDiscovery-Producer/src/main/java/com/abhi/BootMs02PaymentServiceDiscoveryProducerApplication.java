package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMs02PaymentServiceDiscoveryProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMs02PaymentServiceDiscoveryProducerApplication.class, args);
	}

}
