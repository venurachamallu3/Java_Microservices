package com.Greeting.Greeting_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Greeting03Application {

	public static void main(String[] args) {
		SpringApplication.run(Greeting03Application.class, args);
	}

}
