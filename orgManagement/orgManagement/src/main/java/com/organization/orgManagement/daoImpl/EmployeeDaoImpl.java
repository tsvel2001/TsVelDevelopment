package com.organization.orgManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.organization.orgManagement.model.Employees;

@Repository
public class EmployeeDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertEmpData(Employees emp) {

		String insertEmp = "INSERT INTO organization.employees (Emp_name,Designation,DOJ,Location,Mobile,User_name,Password) VALUES (?,?,?,?,?,?,?)";
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
	    jdbcTemplate.update(connection -> {
	        PreparedStatement ps = connection.prepareStatement(insertEmp, Statement.RETURN_GENERATED_KEYS);
	        ps.setString(1, emp.getEmployeeName());
	        ps.setString(2, emp.getDesignation());
	        ps.setString(3, emp.getDoj());
	        ps.setString(4, emp.getLocation());
	        ps.setLong(5, emp.getMobile());
	        ps.setString(6, emp.getUserName());
	        ps.setString(7, emp.getPassword());
	        return ps;
	    }, keyHolder);

	    return keyHolder.getKey().intValue();

	}
	
	public Employees getEmpData(int id) {
		
		Employees emp = new Employees();
		
		String sql = "select * from employees where Emp_id=?";
		
		emp = jdbcTemplate.queryForObject(sql, new Object[] {id}, new RowMapper<Employees>() {

			@Override
			public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employees empl = new Employees();
				empl.setEmployeeName(rs.getString("Emp_name"));
				empl.setDesignation(rs.getString("Designation"));
				empl.setDoj(rs.getString("DOJ"));
				empl.setLocation(rs.getString("Location"));
				empl.setMobile(rs.getLong("Mobile"));
				empl.setUserName(rs.getString("User_name"));
				empl.setPassword(rs.getString("Password"));
				return empl;
			}
			
		});
		
		return emp;
	}

}
