package com.organization.orgManagement.daoImpl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.orgManagement.model.EmployeeProject;
import com.organization.orgManagement.model.Employees;

public interface EmployeeJPARepository extends JpaRepository<Employees, Integer> {

}
