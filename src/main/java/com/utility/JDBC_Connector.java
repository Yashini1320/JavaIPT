package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connector {

	public static String getParticularData() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employees";
		String username = "root";
		String password = "Root@123";
		String query ="select * from employees";
		
		//conection establish
		
	    Connection connection = DriverManager.getConnection(url,username,password);
	    Statement statement = connection.createStatement();
	    ResultSet result = statement.executeQuery(query);
	    result.next();
	    
	    String PartData = result.getString(3);
	    System.out.println(PartData);
	    return PartData;
	    
	} 
	    public static void main(String[] args) throws SQLException {
	    	getParticularData();  
	    
	}
}
