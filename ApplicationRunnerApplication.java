//Implement Application Runner

package com.abc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunnerApplication.class, args);
		System.out.println("Welcome to Spring Boot....");
	}

}
