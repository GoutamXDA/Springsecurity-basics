package com.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springsecurity.controller")
public class BackendBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendBankApplication.class, args);
	}

}
