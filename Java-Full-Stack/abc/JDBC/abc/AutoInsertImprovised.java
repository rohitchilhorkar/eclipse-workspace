package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AutoInsertImprovised {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "Rdc@1437801");
			String sqlstr = "insert into tbl_product(name, price, quantity) values(?,?,?)";
			stmt = conn.prepareStatement(sqlstr,  Statement.RETURN_GENERATED_KEYS);
			boolean yes = true; 
			ResultSet generatedKey = null;
			
			while(yes) {
				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Product Name: ");
				String name = s.nextLine();
				System.out.println("Enter Product Price");
				double price = Double.parseDouble(s.nextLine());
				System.out.println("Enter Product Quantity");
				int quantity = Integer.parseInt(s.nextLine());
				
//				Substituting the placeholders
//				setString(ordernumber of placeholder, value
				
				
				stmt.setString(1, name);
				stmt.setDouble(2, price);
				stmt.setInt(3, quantity);
				
				int count = stmt.executeUpdate(); //return number of rows impacted				
				if(count == 1)
					System.out.println("Record Inserted with ");
				
				generatedKey = stmt.getGeneratedKeys();				
				if(generatedKey!=null && generatedKey.next()) {					
					System.out.print("Primary Key as : " + generatedKey);
				}
//				
				
				
				System.out.println("Do you wish to continue: true or false");
				yes=Boolean.parseBoolean(s.nextLine());				
			}
			System.out.println("Thankyou for inserting the data!");
			
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

	}}
