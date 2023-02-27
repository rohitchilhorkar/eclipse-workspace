package com.pratiti.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//Todo - create table tbl_carpart(part_no int , part_name varchar(20) , car_model varchar(30) , 
//       price double(10,2) , quantity int );

@Component("carPartsInv1")
public class CarPartsInventoryImpl1 implements CarsPartsInventory {
	public void addnewPart(CarPart carPart) {
		// write the jdbc code for inserting the car part data in database
		Connection conn = null;
		PreparedStatement st = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "6292");

			String sql = "Insert into tbl_carpart(part_name,car_model,price,quantity) values(?,?,?,?)";
			st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			st.setString(1, carPart.getPartName());
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());

			st.executeUpdate();
			System.out.println("Record inserted");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

	public List<CarPart> getAvailableParts(){
		Connection conn = null;
		PreparedStatement st = null;
		List<CarPart>list=new ArrayList<CarPart>();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","6292");
			
			st=conn.prepareStatement("select * from tbl_carpart");
			ResultSet rs=st.executeQuery();
			
			while(rs.next())
			{
				CarPart cp = new CarPart();
				cp.setPartNo(1);
				cp.setPartName(rs.getString(2));
				cp.setCarModel(rs.getString(3));
				cp.setPrice(rs.getDouble(4));
				cp.setQuantity(rs.getInt(5));
				list.add(cp);
			}
			return list;
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			return null;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {conn.close();} catch (Exception e) {}
		}

	}
}
