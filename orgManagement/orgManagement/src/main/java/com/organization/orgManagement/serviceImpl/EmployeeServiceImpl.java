package com.organization.orgManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.orgManagement.daoImpl.EmployeeDaoImpl;
import com.organization.orgManagement.daoImpl.EmployeeJPARepository;
import com.organization.orgManagement.model.Employees;
import com.organization.orgManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	@Autowired
	EmployeeJPARepository empRepo;

	@Override
	public int insertEmpData(Employees emp) {
		
		int empId=0;
		
		//empId =  employeeDaoImpl.insertEmpData(emp);
		empRepo.save(emp);
		
		
		return emp.getEmpId();
	}

	@Override
	public Employees getEmpData(int id) {
		// TODO Auto-generated method stub
		//employeeDaoImpl.getEmpData(id)
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employees> getAllEmpData() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public String deleteEmpData(int id) {
		// TODO Auto-generated method stub
		Employees emp = empRepo.findById(id).get();
		empRepo.deleteById(id);
		return "Successfully deleted Employee : "+emp.getEmployeeName();
	}

}
