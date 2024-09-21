package com.Admin.Admin_Server_02;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminServer02Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServer02Application.class, args);
	}

}
