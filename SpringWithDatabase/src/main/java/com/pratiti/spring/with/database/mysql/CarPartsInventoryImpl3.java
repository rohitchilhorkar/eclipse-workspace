package com.pratiti.spring.with.database.mysql;


import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("cpInv3")
public class CarPartsInventoryImpl3 implements CarPartsInventory{	
	
	@Autowired
	private DataSource dataSource;
	
	public void addNewPart(CarPart carPart) {
		
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "insert into inventory(part_name, car_model, price, quantity) values(?,?,?,?)";
		jt.update(sql,  carPart.getPartName(), carPart.getCarModel(), carPart.getPrice(), carPart.getQuantity());
		
	}
	
	public List<CarPart> getAvailableParts(){
		
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "select * from inventory";
//		Returns list of CarPart Objects
		return jt.query(sql, BeanPropertyRowMapper.newInstance(CarPart.class));
		 
	}
}
