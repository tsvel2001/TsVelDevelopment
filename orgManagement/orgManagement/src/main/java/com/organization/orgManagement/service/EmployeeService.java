package com.organization.orgManagement.service;

import com.organization.orgManagement.model.Employees;


public interface EmployeeService {
	
	int insertEmpData(Employees emp);
	
	Employees getEmpData(int id);

}
