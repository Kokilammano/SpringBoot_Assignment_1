package com.abc.input.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {
	@Value("${info.employee.id}")
	private int employeeId;
	
	@Value("${info.employee.name}")
	private String employeename;
	
	@Value("${info.employee.salary}")
	private int employeeSalary;
	
	

	@Override
	public String toString() {
		return " [employeeId=" + employeeId + ", employeename=" + employeename + ", employeeSalary="
				+ employeeSalary + "]";
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	

}
