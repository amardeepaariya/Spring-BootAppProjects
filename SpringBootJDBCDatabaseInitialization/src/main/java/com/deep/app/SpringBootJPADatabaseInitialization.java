package com.deep.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deep.app.entities.Employee;
import com.deep.app.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootJPADatabaseInitialization implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJPADatabaseInitialization.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeRepository.createEmployee(employee);
	}
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Deep Kumar");
		employee.setEmail("dk@gmail.com");
		employee.setSalary(90000.00);
		return employee;
	}
}
