package com.account.AccountRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableEurekaClient
//@ComponentScan("com.account.AccountRegistration.entity")
public class AccountRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountRegistrationApplication.class, args);
	}

}
