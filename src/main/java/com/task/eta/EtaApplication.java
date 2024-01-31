package com.task.eta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtaApplication.class, args);
	}

}
