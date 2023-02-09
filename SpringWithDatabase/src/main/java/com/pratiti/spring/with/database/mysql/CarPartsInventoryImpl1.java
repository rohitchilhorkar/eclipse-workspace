package com.pratiti.spring.with.database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class CarPartsInventoryImpl1 implements CarPartsInventory{
	
	
	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "Rdc@1437801");
				String sql = "insert into inventory(part_name, car_model, price, quantity) values(?,?,?,?)";
				stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ResultSet generatedKey = null;
			
				stmt.setString(1, carPart.getPartName());
				stmt.setString(2, carPart.getCarModel());
				stmt.setDouble(3, carPart.getPrice());
				stmt.setInt(4, carPart.getQuantity());
				
				int count = stmt.executeUpdate();
				if(count == 1)System.out.println("Record Inserted with: ");
				
				generatedKey = stmt.getGeneratedKeys();
				if(generatedKey != null && generatedKey.next())
					System.out.println("Primary Key as: " + generatedKey);
				System.out.println("Thankyou for inserting the data!");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Not Found!");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {conn.close();}
			catch(Exception e) {}
		}
	}
	
	public List<CarPart> getAvailableParts(){
		return null;
	}
}
