package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
		log.info("employee payroll app started");
	}

}
