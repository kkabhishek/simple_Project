package org.spring.mvcApp.Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_Class 
{
	public void jdbcCode(int id, String name, String stNum) 
	{
		String qry = "insert into mvc1.bank values(?,?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","3505");
			PreparedStatement ps = conn.prepareStatement(qry);
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,stNum);
			ps.executeUpdate();
			System.out.println("executed");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
