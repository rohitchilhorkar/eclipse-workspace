package com.pratiti.spring.with.database.mysql;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("cpInv4")
public class CarPartsInventoryImpl4 implements CarPartsInventory{	
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional //dont need to add begin, commit and roll back
	public void addNewPart(CarPart carPart) {
		em.persist(carPart);
	}
	
	public List<CarPart> getAvailableParts(){
		Query q = em.createQuery("select p from CarPart p");
		@SuppressWarnings("unchecked")
		List<CarPart> list = q.getResultList();
		return list;		
	}
}














