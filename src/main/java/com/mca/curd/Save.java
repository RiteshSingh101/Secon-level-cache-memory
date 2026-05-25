package com.mca.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mca.entity.Car;
import com.mca.entity.Engine;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c1 = new Car();
		c1.setCid(1);
		c1.setCname("G-wagenar");
		
		Engine e1 = new Engine();
		e1.setEid(101);
		e1.setHp(1200);
		c1.setEngine(e1);

		et.begin();
		em.persist(e1);
		em.persist(c1);
		et.commit();
		
		System.out.println("Saved....");
	}
}
