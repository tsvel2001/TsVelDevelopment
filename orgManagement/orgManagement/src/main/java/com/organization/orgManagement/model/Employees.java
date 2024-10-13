package com.organization.orgManagement.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_id")
	int empId;
	
	@Column(name="Emp_name", nullable = true)
	String employeeName;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Column(name="Location", nullable = true)
	String location;
	
	@Column(name="DOJ", nullable = true)
	String doj;
	
	@Column(name="Designation", nullable = true)
	String designation;
	
	@Column(name = "Mobile", nullable = true)
	Long mobile;
	
	@Column(name="User_name")
	String userName;
	
	@Column(name="Password")
	String password;
	
	public Employees() {
		
	}

	public Employees(String employeeName, String location, String doj, String designation, long mobile, String userName,
			String password) {
		this.employeeName = employeeName;
		this.location = location;
		this.doj = doj;
		this.designation = designation;
		this.mobile = mobile;
		this.userName = userName;
		this.password = password;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getMobile() {
		return (mobile != null ? mobile : 0L);
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
