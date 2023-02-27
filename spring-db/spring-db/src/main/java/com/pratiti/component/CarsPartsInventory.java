package com.pratiti.component;

import java.util.List;

public interface CarsPartsInventory {
	public void addnewPart(CarPart carPart);
	public List<CarPart>getAvailableParts();
}
