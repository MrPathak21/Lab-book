package com.cg.ui;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

//import com.cg.entity.ContractEmployee;
import com.cg.entity.Employee;
//import com.cg.entity.Manager;
import com.cg.jhd.util.JPAUtil;

public class JPQl2 {

	public static void main(String[] args) {

		EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
     	EntityManager em = factory.createEntityManager();

     	Scanner scan = new Scanner(System.in);
     	System.out.println("Enter least salary:");
     	int leastsalary = scan.nextInt();
     	System.out.println("Enter highest salary:");
     	int highestsalary = scan.nextInt();
     	
     	
     	//:lsal and hsal: are named parameters
     	String jpql = "SELECT e FROM Employee e WHERE e.salary between :lsal AND :hsal";
     	TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
     	tqry.setParameter("lsal", leastsalary);
     	tqry.setParameter("hsal", highestsalary);
     	
     	List<Employee> employees = tqry.getResultList();
     	
     	if(employees.isEmpty()) {
     		System.out.println("No Employees found");
     	}else {
     		employees.stream().forEach(System.out::println);
     		System.out.println("Number of Employees: " + employees.size());
     	}    
     	scan.close();
	    JPAUtil.shutdown();
	}

}
