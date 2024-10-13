package com.organization.orgManagement.service;

import java.util.List;

import com.organization.orgManagement.model.Employees;


public interface EmployeeService {
	
	int insertEmpData(Employees emp);
	
	Employees getEmpData(int id);
	
	List<Employees> getAllEmpData();
	
	String deleteEmpData(int id);

}
