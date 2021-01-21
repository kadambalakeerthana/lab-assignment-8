package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.services.EmployeeService;


@SpringBootApplication
public class EmpappApplication implements CommandLineRunner{

//	@Autowired
//	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//         System.out.println("rec are saved...");
//		empService.save(new Employee("Swathi", 21));
//		empService.save(new Employee("Shalini", 35));
//		empService.save(new Employee("Preethi", 30));
//		empService.save(new Employee("Raju", 25));
		
		
	}
}
