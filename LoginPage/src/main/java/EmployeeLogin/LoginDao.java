package EmployeeLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	public boolean insertCreds(UserClass user) {

		Connection con = null;
		boolean result = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root",
					"root");

			String insertQuery = "insert into employees (Emp_name, Designation, DOJ, Location, Mobile, User_name, password) values ('Subha','CEO','22-FEB-2022','COIMBATORE',9159941621,?,?)";

			PreparedStatement pst = connection.prepareStatement(insertQuery);

			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());

			int i = pst.executeUpdate();

			if(i>1) result=true;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

}
