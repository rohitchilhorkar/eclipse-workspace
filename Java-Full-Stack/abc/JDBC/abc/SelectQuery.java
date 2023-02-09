package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectQuery {
	
public static void main(String[] args) {
		
		Connection conn = null;
		try {
//			----------PreparedStatement vs Statement
//			> PS tells sql in advance that i will work on it
//			> DB -> Compile and Execute each time Statement is given
//			> DB -> Only execute each time Statement is given
//			> Hence it saves time and avoid redundancy in the execution each time,  
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "Rdc@1437801");
			
			PreparedStatement stmt = conn.prepareStatement("select * from tbl_product where price>=?");
			stmt.setDouble(1, 10000);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("--------x--------x---------x---------");
				System.out.println("Product Name: " + rs.getString("name"));
				System.out.println("Product Price: " + rs.getInt("price"));
				System.out.println("Product Quantity: " + rs.getInt("quantity"));
			}
			
//			Reset rs as we have moved it in above loop
			rs = stmt.executeQuery();
			stmt = conn.prepareStatement("delete from tbl_product where name='TVS'");
			stmt.executeUpdate();
			
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Not Found!");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {conn.close();}catch(Exception e) {}
		}

	}
}
