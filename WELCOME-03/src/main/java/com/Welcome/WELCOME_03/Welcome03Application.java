package com.Welcome.WELCOME_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Welcome03Application {

	public static void main(String[] args) {
		SpringApplication.run(Welcome03Application.class, args);
	}

}
