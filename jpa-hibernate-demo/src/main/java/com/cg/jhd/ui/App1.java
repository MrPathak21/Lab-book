package com.cg.jhd.ui;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.jhd.entity.Customer;
import com.cg.jhd.util.JPAUtil;

public class App1 {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
		
		EntityManager em = factory.createEntityManager();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer id:");
		long customerId = scan.nextLong();
		
		Customer customer = em.find(Customer.class, customerId);
		if(customer != null) {
			System.out.println(customer);
		}else {
			System.out.println("Customer with #" + customerId + "is not found");
		}
	    
		scan.close();
	    JPAUtil.shutdown();
	}

}
