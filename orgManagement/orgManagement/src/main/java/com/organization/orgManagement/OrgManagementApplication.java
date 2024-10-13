package com.organization.orgManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.organization.orgManagement")
public class OrgManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgManagementApplication.class, args);
	}

}
