package com.jdbcdemo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDatabaseConnection() {
		
		try {
//				1.load the database Driver.
				Class.forName(DbDetails.DBDRIVER);
				
//				2.get Connection with the database.
				Connection con = 
						DriverManager.getConnection(DbDetails.CONSTRING,DbDetails.USRNAME,DbDetails.PASSWD);
				
				return con;
				
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	
	}

}
