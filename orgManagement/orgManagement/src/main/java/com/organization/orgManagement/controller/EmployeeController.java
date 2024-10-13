package com.organization.orgManagement.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.organization.orgManagement.model.Employees;
import com.organization.orgManagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	Employees emp;

	public EmployeeController(Employees emp) {
		super();
		this.emp = emp;
	} 
	
	@GetMapping("/{id}")
	public Employees getEmployee(@PathVariable("id") int id) {
		
		this.emp=empService.getEmpData(id);
		
		return this.emp;
		
	}
	
	@GetMapping("/getAll")
	public List<Employees> getAllEmployees() {
		
		return empService.getAllEmpData();
		
	}
	
	@DeleteMapping("/delete")
	public String removeEmployee(@RequestParam("id") int id) {
		return empService.deleteEmpData(id);
		}
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employees emp) {
		
		System.out.println(new Gson().toJson(emp));
		
		JSONObject response = new JSONObject();
		
		int empId = empService.insertEmpData(emp);
		
		if(empId>0) {
			response.put("Status", "Successfuly added the employee to organization data base");
			response.put("Employee Id", empId);
		}else {
			response.put("Status", "Failed to add the employee to the organization data base");
		}
		
		return response.toString();
		
	}

}
