package com.cg.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

//import com.cg.entity.ContractEmployee;
import com.cg.entity.Employee;
//import com.cg.entity.Manager;
import com.cg.jhd.util.JPAUtil;

public class JPQl1 {

	public static void main(String[] args) {

		EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
     	EntityManager em = factory.createEntityManager();

     	String jpql = "SELECT e FROM Employee e";
     	TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
     	List<Employee> employees = tqry.getResultList();
     	
     	if(employees.isEmpty()) {
     		System.out.println("No Employees found");
     	}else {
     		employees.stream().forEach(System.out::println);
     		System.out.println("Number of Employees: " + employees.size());
     	}     	
	    JPAUtil.shutdown();
	}

}
