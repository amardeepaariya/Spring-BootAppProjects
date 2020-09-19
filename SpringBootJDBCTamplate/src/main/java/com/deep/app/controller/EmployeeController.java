package com.deep.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.deep.app.entities.Employee;
import com.deep.app.servicesImp.EmployeeServiceImpl;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

 @Autowired
 private EmployeeServiceImpl employeeService;
 
 @RequestMapping(value= {"/list"}, method=RequestMethod.GET)
 public @ResponseBody List<Employee> getAllEmployees() {
  List<Employee> employee = employeeService.getAllEmployees();
  return employee;
 }
 
 @RequestMapping(value="/getbyid/{id}", method=RequestMethod.GET)
 public @ResponseBody Employee editEmployee(@PathVariable int id) {
  
  Employee employee = employeeService.findEmployeeById(id);
  return employee;
 }
 
 @RequestMapping(value="/add/{id}", method=RequestMethod.GET)
 public @ResponseBody Employee addEmployee(@RequestBody Employee employee, @PathVariable int id) {
  
	 if(employee.getEmployeeId() != null) {
		   employeeService.updateEmployee(employee);
		  } 
  return editEmployee(id);
 }
 
 @RequestMapping(value="/save", method=RequestMethod.POST)
 public @ResponseBody List<Employee> saveOrUpdate(@RequestBody Employee employee) {
   employeeService.addEmployee(employee);
  
  return getAllEmployees();
 }
 
 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
 public @ResponseBody List<Employee> deleteEmployee(@PathVariable("id") int id) {
  employeeService.deleteEmployee(id);
  
  return getAllEmployees();
 }
}
