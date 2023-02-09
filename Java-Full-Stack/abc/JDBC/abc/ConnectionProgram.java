package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProgram {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
//			1. Loading the Driver
//			Optional for us
			Class.forName("com.mysql.cj.jdbc.Driver");
//			2. Connecting to Database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "Rdc@1437801");
			System.out.println("Connected!!!!!");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Not Found!");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
//			Important to close this connection, otherwise it will create problems		
			try {conn.close();}catch(Exception e) {}
		}
	}
}
