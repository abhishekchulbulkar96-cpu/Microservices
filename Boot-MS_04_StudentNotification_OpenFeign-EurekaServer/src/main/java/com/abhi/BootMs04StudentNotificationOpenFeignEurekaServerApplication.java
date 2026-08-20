package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMs04StudentNotificationOpenFeignEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMs04StudentNotificationOpenFeignEurekaServerApplication.class, args);
	}

}
