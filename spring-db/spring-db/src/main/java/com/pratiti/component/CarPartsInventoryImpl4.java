package com.pratiti.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component("carPartsInv4")
public class CarPartsInventoryImpl4 implements CarsPartsInventory {
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void addnewPart(CarPart carPart) {
		em.persist(carPart);
	}

	public List<CarPart> getAvailableParts() {
		Query q = em.createQuery("select p from CarPart p",CarPart.class);
		List<CarPart> list = q.getResultList();
		return list;
	}
}
