package com.pratiti.spring.with.database.mysql;

import java.util.List;

public interface CarPartsInventory {

	public void addNewPart(CarPart carPart);
	public List<CarPart> getAvailableParts();
}
