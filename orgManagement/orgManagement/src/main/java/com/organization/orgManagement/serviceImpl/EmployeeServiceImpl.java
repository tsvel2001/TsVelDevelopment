package com.organization.orgManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.orgManagement.daoImpl.EmployeeDaoImpl;
import com.organization.orgManagement.model.Employees;
import com.organization.orgManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;

	@Override
	public int insertEmpData(Employees emp) {
		
		int empId=0;
		
		empId =  employeeDaoImpl.insertEmpData(emp);
		
		return empId;
	}

	@Override
	public Employees getEmpData(int id) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getEmpData(id);
	}

}
