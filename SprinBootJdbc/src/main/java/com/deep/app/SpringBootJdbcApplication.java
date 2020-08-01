package com.deep.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deep.app.dao.EmployeeDAO;
import com.deep.app.model.Employee;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//cerateEmployee();
		//getEmployeeById();
		employeeDAO.updateEmployeeEmailById(3, "subk@gamil.com");
		//employeeDAO.deleteEmployeeById(3);
	}

	private void getEmployeeById() {
		Employee employee = employeeDAO.getEmployeeById(3);
		System.out.println(employee);
	}

	private void cerateEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Amardeep Kumar");
		employee.setEmail("amardeep@gamil.com");
		employee.setSalary(90000.00);
		employeeDAO.createEmployee(employee);
	}
}