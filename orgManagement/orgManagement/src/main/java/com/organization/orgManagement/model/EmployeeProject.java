package com.organization.orgManagement.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="Employee_Project_Data")
public class EmployeeProject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empProjectId;
	
	public int getEmpProjectId() {
		return empProjectId;
	}

	public void setEmpProjectId(int empProjectId) {
		this.empProjectId = empProjectId;
	}

	int empId;
	String empName;
	String projectName;
	String projectCode;
	String projectLocation;
	int monthsAllocated;
	
	public EmployeeProject() {
		
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public int getMonthsAllocated() {
		return monthsAllocated;
	}

	public void setMonthsAllocated(int monthsAllocated) {
		this.monthsAllocated = monthsAllocated;
	}

	public EmployeeProject(int empId, String empName, String projectName, String projectCode, String projectLocation,
			int monthsAllocated) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.projectLocation = projectLocation;
		this.monthsAllocated = monthsAllocated;
	}

}
