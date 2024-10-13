package com.organization.orgManagement.model;

import org.springframework.stereotype.Component;

@Component
public class Employees {
	
	String employeeName;
	String location;
	String doj;
	String designation;
	long mobile;
	String userName;
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
		return mobile;
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
