package com.deep.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deep.app.entities.Employee;
import com.deep.app.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootFlywayIntegration2 implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFlywayIntegration2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
	}
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Amardeep Kumar");
		employee.setEmail("adk@gmail.com");
		employee.setSalary(90000.00);
		return employee;
	}
}
