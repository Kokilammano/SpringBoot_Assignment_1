//Implement Command Line Runner

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerApplication.class, args);
		System.out.println("Welcome to Spring Boot.....");
	}

}
