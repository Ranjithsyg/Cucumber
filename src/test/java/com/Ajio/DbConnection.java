package com.Ajio;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class DbConnection {
		 public static void main(String[]args) throws Throwable {
			
				Class.forName("com.microsoft.sqlserver");
				String connectionString = "";
				Connection conn = DriverManager.getConnection(connectionString);
				Statement statement = conn.createStatement();
				ResultSet result = statement.executeQuery("Select * from tableName");
				String st = result.getString(0);
			 
		 }
	}
	


