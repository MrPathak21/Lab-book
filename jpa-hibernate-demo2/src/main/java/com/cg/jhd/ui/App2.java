package com.cg.jhd.ui;


import java.math.BigDecimal;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.jhd.entity.Employee;
import com.cg.jhd.entity.Laptop;
import com.cg.jhd.util.JPAUtil;

public class App2 {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
     	EntityManager em = factory.createEntityManager();
     	
     	Employee employee = new Employee("Shreya","8970997548");
     	Laptop laptop = new Laptop( "Acer", new BigDecimal(95550.0));
 
     	employee.setLaptop(laptop);
     	EntityTransaction txn = em.getTransaction();
     	txn.begin();
     	em.persist(employee);
     	txn.commit();
     	
	    JPAUtil.shutdown();
	}

}
