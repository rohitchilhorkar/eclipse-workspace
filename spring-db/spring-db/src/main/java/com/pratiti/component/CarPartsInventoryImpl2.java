package com.pratiti.component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("carPartsInv2")
public class CarPartsInventoryImpl2 implements CarsPartsInventory {
	@Autowired
	private DataSource dataSource;
	
	public void addnewPart(CarPart carPart) {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = dataSource.getConnection();

			String sql = "Insert into tbl_carpart(part_name,car_model,price,quantity) values(?,?,?,?)";
			st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			st.setString(1, carPart.getPartName());
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());

			st.executeUpdate();
			System.out.println("Record inserted");
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
			
			
			conn = dataSource.getConnection();
			
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
