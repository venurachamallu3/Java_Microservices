package com.API_Gateway.APIGateway_05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateway05Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway05Application.class, args);
	}

}
