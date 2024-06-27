package database.connection.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		Connection conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/automation","root","Chakri@123");
		
		Statement stat=conn.createStatement();
		
		ResultSet rs=stat.executeQuery("select * from studentdetails where name='chakri'");
		while(rs.next()) {
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("place"));
		}
		

	}

}
