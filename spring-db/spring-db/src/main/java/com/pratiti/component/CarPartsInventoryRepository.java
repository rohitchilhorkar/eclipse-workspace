package com.pratiti.component;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//There are two parameter 1)name of the class 2) datatype of the primary key 
public interface CarPartsInventoryRepository extends CrudRepository<CarPart, Integer> {
	public Iterable<CarPart> findByCarModel(String model);
	public Iterable<CarPart> findByPrice(Double p);
	
//we can also give the query
	@Query("select c from CarPart c where c.quantity=?1 and c.price=?2")
	public Iterable<CarPart> fetchByQuantity(Integer q,Double p);
}
